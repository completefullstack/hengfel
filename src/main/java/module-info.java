/*
* File: module-info.java
* Author: Siegenthaler
* Copyright: 2026, Siegenthaler Alexandra
* Group: Szoft II-E
* Date: 2026-03-31
* Github: https://github.com/completefullstack/
* Licenc: MIT
*/

module com.example {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    opens com.example to javafx.fxml;
    exports com.example;
}
