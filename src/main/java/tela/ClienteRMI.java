package tela;

import clienteServices.ocupacao.CBOService;
import rmi.cidade.ICidadeService;
import rmi.ubs.IUnidadeSaudeService;
import rmiCbo.ICboManager;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Arrays;

public class ClienteRMI {
    public static void main(String[] args) {

        // Endereço da máquina onde o RMI Registry está rodando
        String hostCidadeService = "10.100.33.172"; // IP da Máquina 1
        int portaHostCidadeService = 2000; // Porta do RMI Registry

        String hostCBOService = "localhost"; // IP da Máquina 1
        int portaHostCBOService = 2000; // Porta do RMI Registry

        String hostUBSService = "localhost"; // IP da Máquina 1
        int portaHostUBSService = 2000; // Porta do RMI Registry

        try {

            Registry registryCidadeService = LocateRegistry.getRegistry(hostCidadeService,portaHostCidadeService);
            Registry registryCBOService = LocateRegistry.getRegistry(hostCBOService,portaHostCBOService);
            Registry registryUBSService = LocateRegistry.getRegistry(hostUBSService,portaHostUBSService);


            System.out.println(Arrays.toString(registryCidadeService.list()));

//            ICidadeService cidadeManager = (ICidadeService) registryCidadeService.lookup("rmi://" + hostCidadeService + ":" + portaHostCidadeService + "/cidade");
//
//            ICboManager cboManager = (ICboManager) registryCBOService.lookup("rmi://" + portaHostCBOService + ":" + portaHostCBOService + "/cbo");
//
//            IUnidadeSaudeService unidadeSaudeManager = (IUnidadeSaudeService) registryUBSService.lookup("rmi://" + portaHostUBSService + ":" + portaHostUBSService + "/cbo");



//            System.out.println("Cidade:"+cidadeManager.getCidade(""));

        } catch (Exception e) {
            e.printStackTrace();
        }

   }
}
