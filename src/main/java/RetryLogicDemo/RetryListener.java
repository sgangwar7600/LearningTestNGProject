package RetryLogicDemo;

import java.lang.reflect.Constructor;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.github.dockerjava.transport.DockerHttpClient.Request.Method;

public class RetryListener implements IAnnotationTransformer {

	public void transform (ITestAnnotation testAnnotation, Class testClass, Constructor testConstructor , Method testMethod) {
		
		testAnnotation.setRetryAnalyzer(RetryAnalyser.class);
	}
	
	
}
