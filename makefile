petAPP.class: petAPP.java
	javac -g petAPP.java
clean:
	rm *.class
run: petAPP.class
	java petAPP
