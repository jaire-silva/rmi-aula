package tela;

import rmi.cidade.Cidade;
import rmi.cidade.ICidadeService;
import rmi.ubs.IUnidadeSaudeService;
import rmi.ubs.UnidadeSaude;
import rmiCbo.Cbo;
import rmiCbo.ICboManager;

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
        String hostCidadeService = "192.168.3.65";
        int portaHostCidadeService = 2000;

        String hostCBOService = "localhost";
        int portaHostCBOService = 2000;

        String hostUBSService = "localhost";
        int portaHostUBSService = 2000;

        try {

            Registry registryCidadeService = LocateRegistry.getRegistry(hostCidadeService, portaHostCidadeService);
            Registry registryCBOService = LocateRegistry.getRegistry(hostCBOService, portaHostCBOService);
            Registry registryUBSService = LocateRegistry.getRegistry(hostUBSService, portaHostUBSService);


            ICidadeService cidadeManager = (ICidadeService) registryCidadeService.lookup("rmi://" + hostCidadeService + ":" + portaHostCidadeService + "/cidade");
            ICboManager cboManager = (ICboManager) registryCBOService.lookup("rmi://" + portaHostCBOService + ":" + portaHostCBOService + "/cbo");
            IUnidadeSaudeService unidadeSaudeManager = (IUnidadeSaudeService) registryUBSService.lookup("rmi://" + portaHostUBSService + ":" + portaHostUBSService + "/cbo");


            Menu menu = new Menu(cidadeManager.getCidades(), (List<Cbo>) cboManager.getListCbo(), unidadeSaudeManager.getAll());

            menu.setNomePessoa();
            menu.setCPFPessoa();
            menu.setCidadePessoa();
            menu.setOcupacaoPessoa();

            System.out.println(menu.getPessoa());

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
