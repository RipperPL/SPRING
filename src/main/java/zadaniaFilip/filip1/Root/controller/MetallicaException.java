
package zadaniaFilip.filip1.Root.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason="Metallica ssucks ass")
public class MetallicaException extends Exception {
    }

