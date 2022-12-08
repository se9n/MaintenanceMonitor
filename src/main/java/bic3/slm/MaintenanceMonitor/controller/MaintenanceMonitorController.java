package bic3.slm.MaintenanceMonitor.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Scanner;


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

        return message + "ok";
    }

    @GetMapping("/api/message/reset")
    public String resetStatus() {

        message = "everything works as expected";

        return "ok";
    }


    @PutMapping("/api/message/update")
    public String updateStatus(){
        System.out.println("Set message manually:");
        Scanner entry = new Scanner(System.in);
        message = entry.nextLine();
        return message;

    }

}
