f = open("input.txt")
for l in f:
	l = l.strip()
	if len(l) > 0:
		print("$scope." + l + " = " + "response.data." + l + ";")
		#print("$scope." + l + " = " + "null;")
print()	
f = open("input.txt")
for l in f:
        l = l.strip()
        if len(l) > 0:
                print(l + ": " + "$scope." + l + ",")

print()
f = open("input.txt")
i = 1
print("<tr>")
for l in f:
        l = l.strip()
        if len(l) > 0:
                print("<td><label for=\"focusedInput\">" + l + "</label></td>")
		print("<td> <input id=\"" + l + "\" ng-model = \"" + l + "\" type=\"text\" class=\"form-control input-sm\" placeholder=\"\"> </td>")

		if i % 2 == 0:
			print("</tr><tr>")
	i = i + 1
print("</tr>")
