/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package itslearning.learningtools.myfirstlearningtool.web;

import itslearning.platform.restApi.sdk.common.entities.ApiSession;
import itslearning.platform.restApi.sdk.common.entities.Constants.SimpleStatusType;
import itslearning.platform.restapi.sdk.learningtoolapp.CommunicationHelper;
import itslearning.platform.restapi.sdk.learningtoolapp.LearningObjectServicetRestClient;
import itslearning.platform.restapi.sdk.learningtoolapp.entities.Assessment;
import itslearning.platform.restapi.sdk.learningtoolapp.entities.AssessmentItem;
import itslearning.platform.restapi.sdk.learningtoolapp.entities.AssessmentStatus;
import itslearning.platform.restapi.sdk.learningtoolapp.entities.AssessmentStatusItem;
import itslearning.platform.restapi.sdk.learningtoolapp.entities.LearningObjectInstance;
import itslearning.platform.restapi.sdk.learningtoolapp.entities.LearningObjectInstanceUserReport;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Amund
 */
public class ViewInstance extends BaseServlet
{

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        if (!isApiSessionCreated(request))
        {
            createSession(request);
        }

        PrintWriter out = response.getWriter();
        LearningObjectServicetRestClient restclient = new LearningObjectServicetRestClient(CommunicationHelper.getApiSession(request),
                "http://betarest.itslearning.com");
        LearningObjectInstance loi = null;
        List<Assessment> assessments = null;
        List<AssessmentItem> assessmentItems = null;
        List<AssessmentStatus> possibleAssessmentStatuses = null;
        List<AssessmentStatusItem> assessmentStatusItems = null;
        List<LearningObjectInstanceUserReport> reports = null;
        LearningObjectInstanceUserReport report = new LearningObjectInstanceUserReport();
        report = generateMockUserReport();
        int instanceId = CommunicationHelper.getLearningObjectInstanceId(request);
        int learningObjectId = CommunicationHelper.getLearningObjectId(request);
        int userId = CommunicationHelper.getUserInfo(request).getUserId();
        try
        {
            loi = restclient.getLearningObjectInstance(instanceId, learningObjectId);
            assessments = restclient.getPossibleAssessments(instanceId, learningObjectId);
            assessmentItems = restclient.getAssessmentItems(instanceId, learningObjectId);
            // possibleAssessmentStatuses = restclient.getPossibleAssessmentStatuses(instanceId, learningObjectId);
            //assessmentStatusItems = restclient.getAssessmentStatusItems(instanceId, learningObjectId);
            //reports = restclient.getLearningObjectInstanceUserReports(instanceId, learningObjectId);
            // report = restclient.getLearningObjectInstanceUserReport(instanceId, learningObjectId, userId);
            restclient.updateLearningObjectInstance(loi, instanceId, learningObjectId);
            restclient.updateLearningObjectInstanceUserReport(report, instanceId, learningObjectId, userId);

        } catch (Exception ex)
        {
            throw new RuntimeException(ex);
        }

        //response.setContentType("text/html;charset=UTF-8");
        String firstName = CommunicationHelper.getUserInfo(request).getFirstName();
        String lastName = CommunicationHelper.getUserInfo(request).getLastName();

        try
        {

            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet ViewInstance</title>");
            out.println("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=iso-8859-1\" />");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ViewInstance at " + request.getContextPath() + "</h1>");
            out.println("<p>Session initialized!</p>");
            out.println("<p>Your name is: " + firstName + " " + lastName + "</p>");
            out.println("<p>LearningObjectInstance title: " + loi.getTitle());
            out.println("</body>");
            out.println("</html>");

        } finally
        {
            out.close();
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo()
    {
        return "Short description";
    }// </editor-fold>

    private LearningObjectInstanceUserReport generateMockUserReport()
    {
        LearningObjectInstanceUserReport r = new LearningObjectInstanceUserReport();
        r.setComment("A comment");
        r.setFirstName("Amund");
        r.setLastName("Trovåg");
        r.setSimpleStatus(SimpleStatusType.ONGOING);
        return r;
    }
}