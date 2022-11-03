module com.example.javacalculatorgui {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.web;
	
	requires org.controlsfx.controls;
	requires com.dlsc.formsfx;
	requires org.kordamp.ikonli.javafx;
	
	opens com.example.javacalculatorgui to javafx.fxml;
	exports com.example.javacalculatorgui;
}