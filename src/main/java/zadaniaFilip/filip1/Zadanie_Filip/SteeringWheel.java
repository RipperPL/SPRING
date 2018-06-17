package zadaniaFilip.filip1.Zadanie_Filip;

import org.springframework.stereotype.Component;


public class SteeringWheel extends CarComponent {

    private String material;
    private Boolean playerControl;

    public SteeringWheel(String material, Boolean playerControl) {
        this.material = material;
        this.playerControl = playerControl;
        super.guarantee=2;
        super.price=800;
        }
    }
