package AutomovilService;

import model.Automovil;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutomovilInterfaceImp implements InterfaceAutomovil {

    private List<Automovil> automovil;

    public AutomovilInterfaceImp(){
        this.automovil = new ArrayList<>();

        
    }

    @Override
    public List<Automovil> buscarAutomovil() {
        return null;
    }
}
