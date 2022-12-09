package bic3.slm.MaintenanceMonitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MaintenanceMonitorController {

    /*
    *@param message Nachricht, die anzuzeigen ist, default ist "everything works as expected"
    */
    String message = "everything works as expected";

    /**
     * Diese Methode gibt die aktuellste Statusnachricht message aus
     *
     *
     * @return message, also aktuellste Statusnachricht
     */
    @GetMapping("/api/message/")
    public String currentStatus() {
        return message;
    }

    /**
     * Diese Methode ermöglicht es uns die Statusnachricht message zu ändern. Dies kann manuell von
     * einem User verändert werden, auf was er*sie möchte
     * @param changeMessage die Nachricht, die dann als String message übernommen wird
     * @return "ok", um dem User zu bestätigen, dass die Nachricht erfolgreich übermittelt wurde
     */
    @PostMapping("/api/message/set")
    public String changeStatus(@RequestParam(value = "m") String changeMessage) {

        message = changeMessage;

        return "ok";
    }

    /**
     * Diese Methode setzt String message zurück auf die default Nachricht "everything works as expected"
     *
     *
     * @return "ok", um dem User zu bestätigen, dass die Nachricht erfolgreich übermittelt wurde
     */
    @GetMapping("/api/message/reset")
    public String resetStatus() {

        message = "everything works as expected";

        return "ok";
    }
}
