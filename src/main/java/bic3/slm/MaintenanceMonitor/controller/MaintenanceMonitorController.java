package bic3.slm.MaintenanceMonitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    String message = "everything works as expected";

    @GetMapping("/api/message/")
    public String currentStatus() {
        return message;
    }

    @PostMapping("/api/message/set")
    public String changeStatus(@RequestParam(value = "m") String changeMessage) {

        message = changeMessage;

        return "ok";
    }

    @GetMapping("/api/message/reset")
    public String resetStatus() {

        message = "everything works as expected";

        return "ok";
    }
}
