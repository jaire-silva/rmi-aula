package tela;


import rmi.cidade.Cidade;
import rmi.cidade.ICidadeService;
import rmi.ubs.IUnidadeSaudeService;
import rmi.ubs.UnidadeSaude;
import rmiCBO.ICboManager;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ClienteRMI {
    public static void test(ICidadeService cidadeManager) throws RemoteException {
        List<Cidade> cidades = new ArrayList<>();
        cidades = cidadeManager.getCidades();


        System.out.println("Cidade:" + cidades);
    }

    public static void main(String[] args) {
        String hostCidadeService = "10.100.33.28";
        int portaCidadeService = 2000;

        String hostCBOService = "10.100.32.7";
        int portaCBOService = 2000;

        String hostUBSService = "10.100.32.40";
        int portaUBSService = 2000;

        try {

            Registry registryCidadeService = LocateRegistry.getRegistry(hostCidadeService, portaCidadeService);
            Registry registryCBOService = LocateRegistry.getRegistry(hostCBOService, portaCBOService);
            Registry registryUBSService = LocateRegistry.getRegistry(hostUBSService, portaUBSService);


            ICidadeService cidadeManager = (ICidadeService) registryCidadeService.lookup("rmi://" + hostCidadeService + ":" + portaCidadeService + "/cidade");
////            ICboManager cboManager = (ICboManager) registryCBOService.lookup("rmi://" + hostCBOService + ":" + portaCBOService + "/cbo");
            IUnidadeSaudeService unidadeSaudeManager = (IUnidadeSaudeService) registryUBSService.lookup("rmi://" + hostUBSService + ":" + portaUBSService + "/unidadesSaude");



////            Menu menu = new Menu(cidadeManager.getCidades(), (List<Cbo>) cboManager.getListCbo(), unidadeSaudeManager.getAll());
            Menu menu = new Menu(cidadeManager.getCidades(), new ArrayList<>(), unidadeSaudeManager.getAll());

            menu.iniciar();


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
