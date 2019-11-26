package proxectoexists;

import java.io.File;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.Resource;
import org.xmldb.api.base.ResourceIterator;
import org.xmldb.api.base.ResourceSet;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XPathQueryService;

/**
 *
 * @author Alba
 */
public class ProxectoExists {

    public static String driver = "org.exist.xmldb.DatabaseImpl";

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, XMLDBException {

        Class<?> cl = Class.forName(driver);
        Database database = (Database) cl.newInstance();
        DatabaseManager.registerDatabase(database);
//        String coleccion = "/db";
        String coleccion = "/db/cousas";
        Collection col;
        String uri = "xmldb:exist://localhost:8080/exist/xmlrpc";
        col = DatabaseManager.getCollection(uri + coleccion, "admin", "oracle");

        //mostrar todas las colecciones (/db)
//        String[] childCollections = col.listChildCollections();
//
//        for (String i : childCollections) {
//            System.out.println(i);
//        }
        //mostrar recursos dunha coleccion (/db/cousas)
        String[] resources = col.listResources();

        for (String i : resources) {
            System.out.println(i);
        }

        //crear coleccion
//        CollectionManagementService mgtService= (CollectionManagementService) col.getService("CollectionManagementService","1.0");
//	mgtService.createCollection("cousas");
        //subir recurso(documento) a unha colecion:
//        File arquivo = new File("empleados.xml");
//        File arquivo2 = new File("proba.xml");
//        File arquivo3 = new File("proba2.xml");
//
//        Resource res1 = col.createResource(arquivo.getName(), "XMLResource");
//        Resource res2 = col.createResource(arquivo2.getName(), "XMLResource");
//        Resource res3 = col.createResource(arquivo3.getName(), "XMLResource");
//        res1.setContent(arquivo);
//        res2.setContent(arquivo2);
//        res3.setContent(arquivo3);
//        col.storeResource(res1);
//        col.storeResource(res2);
//        col.storeResource(res3);

        //amosar contido dos recursos dunha coleccion
//        XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
//        ResourceSet resultado = servicio.query("/EMPLEADOS/EMP_ROW[DEPT_NO=10]");
//        ResourceIterator i = resultado.getIterator();
//        
//        while(i.hasMoreResources()) {
//            Resource r = i.nextResource();
//            System.out.println((String) r.getContent());
//        }
        //inserir elemento dentro do documento (recurso)  dunha colecion
//        XPathQueryService servicio1 = (XPathQueryService) col.getService("XPathQueryService", "1.0");
//        String cons = "update insert <zona><cod_zona>50</cod_zona><nombre>Madrid-Oeste</nombre><director>Alicia Ramos Martin</director></zona> into /EMPLEADOS/ZONAS";
//        ResourceSet result = servicio1.queryResource("empleados.xml", cons);

        //actualizar elemento dentro do documento (recurso) dunha colecion (sendo col a colecion)
//        XPathQueryService servicio = (XPathQueryService) col.getService("XPathQueryService", "1.0");
//        String cons = "update value /EMPLEADOS/EMP_ROW[EMP_NO=7369]/APELLIDO with 'RODROGUEZ'";
//        ResourceSet result = servicio.queryResource("empleados.xml", cons);
        
        //borrar elemento dentro do documento (recurso) dunha colecion
//        XPathQueryService servicio2 = (XPathQueryService) col.getService("XPathQueryService", "1.0");
//        String cons2 = "update delete /empleados/zonas/zona[cod_zona=50]";
//        ResourceSet result2 = servicio2.queryResource("empleados.xml", cons2);

    }

}
