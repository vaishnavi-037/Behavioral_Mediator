package exampleOne.mediator;

import exampleOne.component.Airplane;

public interface AirTrafficControlTower {
    void requestTakeoff(Airplane airplane);
    void requestLanding(Airplane airplane);
}
