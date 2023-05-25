<%@ taglib uri="/WEB-INF/taglib/sample-taglib.tld" prefix="sampleTags" %>
<%@ page import="com.niesens.sample.SpringBootJSP.HelloWorldController" %>

<!DOCTYPE html>

<html lang="en">

<body>
  <div>
	Message:
    <%= HelloWorldController.getMessage() %>
	<br>
	Time: ${time}
  </div>
  <div>
    <a href="/exception">Create an exception</a>
  <div>
  <sampleTags:footer>Samples for learning</sampleTags:footer>
</body>

</html>