import javaBeans.* ;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import java.util.Map ;
import java.util.Collections ;
import java.io.IOException ;

public class Main {

	public static void main(String[] args) {
		JavaBeansFactory fabrique = JavaBeansFactory.eINSTANCE ;
		
		/* joli travail
		//creation des objets
		Archive demoJar= fabrique.createArchive();
		Paquetage gis4AlComposants = fabrique.createPaquetage() ;
		Paquetage gis4Ppo = fabrique.createPaquetage();
		Paquetage javaLang = fabrique.createPaquetage();

		Composant SmileyBean = fabrique.createComposant();
		Composant IncrementeurBean = fabrique.createComposant();
		Composant Temperature = fabrique.createComposant();
		Composant String= fabrique.createComposant();
		Composant Compte= fabrique.createComposant();

		Evenement sourire= fabrique.createEvenement();

		Methode incr=fabrique.createMethode();
		Methode raz=fabrique.createMethode();
		Methode toggleSmile=fabrique.createMethode();

		ProprieteBean text=fabrique.createProprieteBean();
		ProprieteBean nom=fabrique.createProprieteBean();
		ProprietePrimitive temperature=fabrique.createProprietePrimitive();
		ProprietePrimitive idCompte=fabrique.createProprietePrimitive();
		ProprietePrimitive solde=fabrique.createProprietePrimitive();	

		//Set des elements
		//Ne pas oublier de setter le nom de l'archive !!

		demoJar.getPaquetage().add(gis4AlComposants);
		demoJar.getPaquetage().add(gis4Ppo);
		demoJar.getPaquetage().add(javaLang);

		gis4AlComposants.setNom("gis4.al.composants");
		gis4Ppo.setNom("gis4.ppo");
		javaLang.setNom("java.lang");

		gis4AlComposants.getElements().add(SmileyBean);
		gis4AlComposants.getElements().add(IncrementeurBean);
		gis4AlComposants.getElements().add(Temperature);

		javaLang.getElements().add(String);
		gis4Ppo.getElements().add(Compte);

		IncrementeurBean.setNom("IncrementeurBean");
		Temperature.setNom("Temperature");
		String.setNom("String");
		Compte.setNom("Compte");
		SmileyBean.setNom("SmileyBean");

		sourire.setNom("sourire");

		incr.setNom("incr");
		raz.setNom("raz");
		toggleSmile.setNom("toggleSmile");

		text.setNom("text");
		nom.setNom("nom");
		nom.setComposant(String);
		nom.setProperty(Property.SIMPLE);
		temperature.setNom("temperature");
		temperature.setProperty(Property.LIÉE);
		idCompte.setNom("idCompte");
		idCompte.setPrimitive(Primitive.INT);
		idCompte.setProperty(Property.SIMPLE);
		solde.setNom("solde");
		solde.setPrimitive(Primitive.DOUBLE);
		solde.setProperty(Property.CONTRAINTE);

		SmileyBean.getMethodes().add(toggleSmile);
		SmileyBean.getDeclenche().add(sourire);

		IncrementeurBean.getMethodes().add(raz);
		IncrementeurBean.getMethodes().add(incr);
		IncrementeurBean.getProprietes().add(text);
		IncrementeurBean.getEcoute().add(sourire);
		text.setComposant(String);

		Temperature.getProprietes().add(temperature);

		Compte.getProprietes().add(idCompte);
		Compte.getProprietes().add(solde);
		Compte.getProprietes().add(nom);
		fin du joli travail */
		
		Archive demoJar=chargerModele("../../runtime-EclipseApplication/testJavaBean/testJavaBeans.javabeans") ;
		
		int nbPropriete;
		int nbProprieteLiee;
		int nbProprieteContrainte;

		for (Paquetage paquetage: demoJar.getPaquetage()){

			for(ElementModele elt: paquetage.getElements()){

				if(elt instanceof Composant && elt!=null){
					System.out.println("*) composant "+paquetage.getNom()+"."+ elt.getNom()+" :");
					nbPropriete=0;
					nbProprieteLiee=0;
					nbProprieteContrainte=0;
					for(Propriete prop: ((Composant) elt).getProprietes()){

						if(prop.getProperty()!=null) nbPropriete++;

						if(prop.getProperty().getValue()==Property.CONTRAINTE_VALUE){
							nbProprieteContrainte++;	
						}
						if(prop.getProperty().getValue()==Property.LIÉE_VALUE){
							nbProprieteLiee++;
						}
					}
					System.out.println("- nb .propriétés: "+nbPropriete+"(nb. liées:"+nbProprieteLiee+", nb.contraintes:"+nbProprieteContrainte+")");

					if( ((Composant) elt).getDeclenche().size()>0 ){
						for(Evenement evnt: ((Composant) elt).getDeclenche()){
							System.out.println("- peut déclencher: "+paquetage.getNom()+"."+evnt.getNom());
						}
					}else{
						System.out.println("- ne déclenche pas d'événements");
					}


					if( ((Composant) elt).getEcoute().size()>0 ){
						for(Evenement evntAudited: ((Composant) elt).getEcoute()){
							System.out.println("- est auditeur de: "+paquetage.getNom()+"."+evntAudited.getNom());
						}
					}else{
						System.out.println("- n'est pas auditeur d'événements");
					}



				}
			}
		}
		sauvegardeModele("model/testJavaBeans.javaBeans", demoJar);

	}
	public static void sauvegardeModele(String cheminFichier,Archive demoJar) {
		URI fileURI = URI.createFileURI(cheminFichier);
		Resource resource = new XMIResourceFactoryImpl().createResource(fileURI);
		resource.getContents().add( demoJar );
		try {
			resource.save(Collections.EMPTY_MAP);
		} catch (IOException e) { e.printStackTrace(); }
	}
	public static Archive chargerModele(String cheminFichier) {
		JavaBeansPackage.eINSTANCE.eClass();
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("javabeans", new XMIResourceFactoryImpl());
		ResourceSet resSet=new ResourceSetImpl();
		Resource res = resSet.getResource(URI.createURI(cheminFichier),true);
		Archive arch = (Archive)res.getContents().get(0);
		return arch ;
	}
}
