module co.edu.uniquindio.marketplacefx.marketplaceapp {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.marketplacefx.marketplaceapp to javafx.fxml;
    exports co.edu.uniquindio.marketplacefx.marketplaceapp;
}