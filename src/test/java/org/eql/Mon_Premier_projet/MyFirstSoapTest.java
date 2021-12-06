package org.eql.Mon_Premier_projet;



import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.List;
import java.util.logging.Logger;

import org.apache.xmlbeans.XmlException;
import org.junit.Test;

import com.eviware.soapui.impl.wsdl.WsdlProject;
import com.eviware.soapui.model.support.PropertiesMap;
import com.eviware.soapui.model.testsuite.TestCase;
import com.eviware.soapui.model.testsuite.TestRunner;
import com.eviware.soapui.model.testsuite.TestSuite;
import com.eviware.soapui.support.SoapUIException;
import com.eviware.soapui.tools.SoapUITestCaseRunner;


/**
 * Unit test for simple App.
 */
public class MyFirstSoapTest

{

	/**
	 * Faire tourner un test soapui, méthode simple "https://richard-carree.developpez.com/tutoriels/junit-services-web-soapui/"
	
*/
	@Test
	public void test() throws Exception {
		SoapUITestCaseRunner testCaseRunner = new SoapUITestCaseRunner();
		testCaseRunner.setProjectFile("src/test/resources/Countryname-soapui-project.xml");
		try {
			testCaseRunner.run();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
/**
	
	private final Logger LOGGER = Logger.getLogger(MyFirstSoapTest.class.getName());
	
	@Test
	public void JunitTest1()
	        throws XmlException, IOException, SoapUIException {
	    // Creer une nouvelle instance de WsdlProject en specifiant le chemin absolu du projet SoapUI
	    WsdlProject project = new WsdlProject(
	            "src/test/resources/Countryname-soapui-project.xml");
	    // Recupere tous les TestSuites inclus dans le projet SoapUI
	    List<TestSuite> testSuiteList = project.getTestSuiteList();
	    // Iteration sur tous les TestSuites du projet
	    for (TestSuite ts : testSuiteList) {
	        System.out.println("******Running " + ts.getName() + "***********");
	        // Recupere tous les TestCases d'une TestSuite
	        List<TestCase> testCaseList = ts.getTestCaseList();
	        // Iteration sur tous les TestCases d'un TestSuite particulier
	        for (TestCase testcase : testCaseList) {
	            System.out.println("******Running " + testcase.getName() + "***********");
	            // Execute le TestCase specifie
	            TestRunner testCaseRunner = testcase.run(new PropertiesMap(), false);
	            // Verifie si le TestCase s'est termine correctement
	            // ou s'il a echoue à cause d'un echec d'assertion
	            assertEquals(TestRunner.Status.FINISHED, testCaseRunner.getStatus());
	        }
	    }
	}
	
		*/

}
