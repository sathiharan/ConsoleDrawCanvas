	ConsoleDrawCanvas
		Interview Assignment

	Developed using:
		1) Apache Maven 3 build tool 
		2) Netbeans 8.1 IDE
		3) Junit 

	As for the description the ConsoleDrawCanvas has to create the canvas with 
	using the create command "C" and followed by the size of the width and hight.
	In the same way the remaing commands given in the description much have to 
	be carried out to perform the Draw line, Draw rectangle and Bucketfill 
	operations has been implemented in this project.
	
	This project consis of the following packages:
	Source Packages:
		* com.sathiya.consoledrawcanvas
		* com.sathiya.consoledrawcanvas.Canvas
		* com.sathiya.consoledrawcanvas.CommandLineScanner
		* com.sathiya.consoledrawcanvas.Commands
		* com.sathiya.consoledrawcanvas.Controller
		* com.sathiya.consoledrawcanvas.Shapes
		
	Test Packages:
		* Canvas
		* Commands
		* Shapes
	
	#com.sathiya.consoledrawcanvas
		This package has the Main class as "MainConsoleDrawCanvas" which used to execute the project.
	#com.sathiya.consoledrawcanvas.Canvas
		Consist of Canvas and CanvasArea which defines the outer canvas border and inside canvas area to be used for drawing.
	#com.sathiya.consoledrawcanvas.CommandLineScanner
		Is used to get the inputs from the user
	#com.sathiya.consoledrawcanvas.Commands
		Is used to perform the Create canvas, Draw Line, Draw Rectange and Bucketfill operations.
		This command flow will be controlled using a Contoller "CanvasCommandController"
	#com.sathiya.consoledrawcanvas.Controller
		This package has ConsoleDrawCanvasController which is a main contoller used to controll the flow.
		It contollows the flow of operations between CommandLineScanner, Commands, Canvas and Shapes.
	#com.sathiya.consoledrawcanvas.Shapes
		It defines the LineShape, RectangleShape to be drawn in the canvas.
	
	The Junit Test has been carried out in for the Canvas, Commands and Shapes.		
