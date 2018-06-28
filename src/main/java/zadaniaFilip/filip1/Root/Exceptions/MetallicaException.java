
package zadaniaFilip.filip1.Root.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.FORBIDDEN, reason="Metallica ssucks ass")
public class MetallicaException extends Exception {
    }

