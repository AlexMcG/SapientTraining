<!DOCTYPE html>
<html>
<head>
<title>Home</title>
<script type="text/javascript" src="http://platform.linkedin.com/in.js">
  api_key:77a3gl1p3tvgf0
  onLoad: OnLinkedInFrameworkLoad
  authorize:true
</script>
<script type="text/javascript">
function OnLinkedInFrameworkLoad() {
    IN.Event.on(IN, "auth", OnLinkedInAuth);
  }
  
function OnLinkedInAuth() {
  IN.API.Profile("me").result(ShowProfileData);
}

function ShowProfileData(profiles) {
  var member = profiles.values[0];
  var id=member.id;
  var firstName=member.firstName; 
  var lastName=member.lastName; 
  var photo=member.pictureUrl; 
  var headline=member.headline; 

  alert(firstName);
}
</script>
</head>
<body>
<script type="in/Login">
</script>
</body>
</html>