<html>

<body>
	<script type="text/javascript">
		function submit() {
			var xhr = new XMLHttpRequest();
			data = {
				userName : "mouqi",
				password : "nishigeshabi"
			}
			xhr.open("POST", "login.do", true);
			xhr.onreadystatechange = function() {
				console.log(xhr.responseText);
			}
			xhr.send(JSON.stringify(data));
		}
	</script>
	<input type="button" value="submit" onclick="submit()">

</body>
</html>
