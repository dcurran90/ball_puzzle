<html>
<body>
<div style="margin: auto; text-align: center"><h3>Boy this Sure is Fun!</h3></div>
<div style="margin: auto; text-align: center; border: 2px black solid">Comparisons Left: <%= 2 - userSession.trialCount %></div><br>
<div style="margin: auto; text-align: center; border: 2px black solid">
<g:scimg scale-result="${scale.compare()}" />

<form name="form1" action="trial" method="post">
	<table>
		<tr>
			<th>id</th><th>Out</th>
			<th style="color: ${scale.compare() <= 0 ? 'green' : 'black'}">Left</th>
			<th style="color: ${scale.compare() >= 0 ? 'green' : 'black'}">Right</th>
		</tr>
		
		<g:each in="${userSession.trials}" status="i" var="trial">
			<tr>
				<td>${trial.ball.id}</td>
				<g:radioGroup name='${"ball"+i}' values='["out","left","right"]' value="${trial.side}"><td>${it.radio}</td></g:radioGroup>
			</tr>
		</g:each>
	</table>
	<input type="hidden" name="derp" value="SAUCE"></input>


	<g:if test="${userSession.trialCount<2}">
		<input type='submit' value='Compare'></input>
	</g:if>

</form>

<g:if test="${userSession.trialCount>=2}"> 
	<p>You are out of quarters...time to pick the heaviest ball!</p>
	<form name="form2" action="results" method="post">
		<table>
			<tr><g:radioGroup name="ball" values='${1..7}' labels='${1..7}'><td>${it.label}${it.radio}</td></g:radioGroup></tr>
		</table>
		<input type="submit" value="Submit Answer"></input>
	</form>
</g:if>


<a href="reset">Start over</a>
</div>
<g:copyright startYear="2002">Stiffle Joy Co.</g:copyright>
</body>
</html>