<%@ page import="canvas.SignedRequest" %>
<%@ page import="canvas.CanvasRequest" %>
<%@ page import="sonoma.SFDoc" %>
<%@ page import="java.util.Map" %>
<%
    // Pull the signed request out of the request body and verify/decode it.
    Map<String, String[]> parameters = request.getParameterMap();
    String[] signedRequest = parameters.get("signed_request");
    if (signedRequest == null) {%>
        This App must be invoked via a signed request!<%
        return;
    }
    String yourConsumerSecret=System.getenv("CANVAS_CONSUMER_SECRET");
    //String yourConsumerSecret="1818663124211010887";
    %>Before canvas request<%
    CanvasRequest cr = SignedRequest.verifyAndDecode(signedRequest[0], yourConsumerSecret);
    %>after canvas request<%
//    cr.toString();
    
//	SFDoc mydoc = new SFDoc();
//	mydoc.initMetadataBinding(cr.getClient().getInstanceUrl(), cr.getClient().getOAuthToken());
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" lang="en">
<head>

    <title>Salesforce Documentation</title>

    <link rel="stylesheet" type="text/css" href="/sdk/css/canvas.css" />

    <!-- Include all the canvas JS dependencies in one file -->
    <script type="text/javascript" src="/sdk/js/canvas-all.js"></script>
    <!-- Third part libraries, substitute with your own -->
    <script type="text/javascript" src="/scripts/json2.js"></script>

    <script>
        if (self === top) {
            // Not in Iframe
            alert("This canvas app must be included within an iframe");
        }

    </script>
</head>
<body>
	<div>PROFILE: System Administrator</div>
	<br/>
	<div>Applications</div>
	<table>
		<th>Name</th>
		<%--<% for (String my : mydoc.getProfiles()) { %>--%>
			<%--<%= my %>--%>
		<%--<% } %>--%>
	</table>
</body>
</html>
