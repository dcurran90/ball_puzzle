<html>
<body>
<div style="margin: auto; text-align: center"><h3>Boy this Sure is Fun!</h3></div>
<div style="margin: auto; text-align: center; border: 2px black solid">Comparisons Left: <%= 2 - userSession.trialCount %></div><br>
<div style="margin: auto; text-align: center; border: 2px black solid">
<%
if (scale.compare()>0)
	print "<img src=${createLinkTo(dir: 'images', file: 'scale-right.png')} alt='Grails'/>"
else if (scale.compare()<0)
	print "<img src=${createLinkTo(dir: 'images', file: 'scale-left.png')} alt='Grails'/>"
else
	print "<img src=${createLinkTo(dir: 'images', file: 'scale-balanced.png')} alt='Grails'/>"
def i=0

println "<form name='form1' action='trial' method='post'>"
println "<table>"
print "<th>id</th><th>Out</th>"

print "<th><font "
if (scale.compare()<=0)
	 print "color='green'"
print ">"
print "Left"
print "</font></th>"

print "<th><font "
if (scale.compare()>=0)
	 print "color='green'"
print ">"
print "Right"
print "</font></th>"

for (trial in userSession.trials) {
	print "<tr>"
	print "<td>"+trial.ball.id+"</td>"
	
	print "<td><input type='radio' name='ball"+i+"' value='out'"
	if (trial.side == "out")
		print "checked"
	print "></input></td>"
	
	print "<td><input type='radio' name='ball"+i+"' value='left'"
	if (trial.side == "left")
		print "checked"
	print "></input></td>"
	
	print "<td><input type='radio' name='ball"+i+"' value='right'"
	if (trial.side == "right")
		print "checked"
	print "></input></td>"
	
	print "</tr>"
	i++
}
print "<input type='hidden' name='derp' value='SAUCE'></input>"
print "</table>"
if (userSession.trialCount<2)
	print "<input type='submit' value='Compare'></input>"
	
print "</form>"

if (userSession.trialCount>=2) {
	print "You are out of quarters...time to pick the heaviest ball!<br>"
	print "<form name='form2' action='results' method='post'>"
	print "<table><tr>"
	1.upto(7) {
		print "<td><input type='radio' name='ball' value='"+it+"'>"+it+"</input></td>"
	}
	print "</tr></table><input type='submit' value='Submit Answer'></input></form>"
}
%>

<a href="reset">Start over</a>
</div>
</body>
</html>