import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
	
	public static final String IMAGE_PATH = "./src/img/";
	
	//Class Attributes
	private ArrayList<MainDeckCard> deck;
	private ArrayList<IlluminatiCard> illuminatiDeck;
	
	private Random random;
	
	//Constructor
	public Deck() {
		deck = new ArrayList<MainDeckCard>();
		illuminatiDeck = new ArrayList<IlluminatiCard>();
		
		createDeck();
		shuffleDeck();
	}
	
	//Creates the cards and places them in the deck
	//Called once in the constructor
	private void createDeck(){
		
		//---------------------------------CREATE GROUP CARDS-----------------------------------------------
		BasicGroupAbility ability;
		ArrayList<GroupCard.Arrow> outwardArrows;
		GroupCard groupCard;
		ArrayList<GroupCard.Alignment> alignments;
		ArrayList<GroupCard> groups;
		
		//American Autoduel Association
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("American Autoduel Association", 1, 0, 5, 1, IMAGE_PATH + "AmericanAutoduelAssociation.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);				
		deck.add(groupCard);
		
		//Nuclear Power Companies
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		groupCard = new GroupCard("Nuclear Power Companies", 4, 0, 4, 3, IMAGE_PATH + "NuclearPowerCompanies.png", GroupCard.Arrow.RIGHT, outwardArrows, GroupCard.Alignment.CONSERVATIVE);				
		deck.add(groupCard);
		GroupCard nuclearPowerCompanies = groupCard;
		
		//Anti-Nuclear Activists
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, nuclearPowerCompanies, Global.AttackType.DESTROY, 2);
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		groupCard = new GroupCard("Anti-Nuclear Activists", 2, 0, 5, 1, IMAGE_PATH + "AntiNuclearActivists.png", GroupCard.Arrow.LEFT, outwardArrows, GroupCard.Alignment.LIBERAL, ability);				
<<<<<<< HEAD
		GroupCard antiNuclearActivists = groupCard;
=======
>>>>>>> origin/master
		deck.add(groupCard);
		
		//Antiwar Activists
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.PEACEFUL);
		alignments.add(GroupCard.Alignment.LIBERAL);
		groupCard = new GroupCard("Antiwar Activists", 0, 0, 3, 1, IMAGE_PATH + "AntiwarActivists.png", GroupCard.Arrow.LEFT, null, alignments);				
		deck.add(groupCard);
		
		//Big Media
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.LIBERAL);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("Big Media", 4, 3, 6, 3, IMAGE_PATH + "BigMedia.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);				
		GroupCard bigMedia = groupCard;
		deck.add(groupCard);
		
		//Boy Sprouts
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.STRAIGHT);
		alignments.add(GroupCard.Alignment.PEACEFUL);
		groupCard = new GroupCard("Boy Sprouts", 0, 0, 3, 1, IMAGE_PATH + "BoySprouts.png", GroupCard.Arrow.LEFT, null, alignments);				
		deck.add(groupCard);
		
		//California
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.LIBERAL);
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		groupCard = new GroupCard("California", 5, 0, 4, 5, IMAGE_PATH + "California.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);				
		deck.add(groupCard);
		
		//CFL-AIO
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		groupCard = new GroupCard("CFL-AIO", 6, 0, 5, 3, IMAGE_PATH + "CFLAIO.png", GroupCard.Arrow.RIGHT, outwardArrows, GroupCard.Alignment.LIBERAL);				
		deck.add(groupCard);
		
		//Chinese Campaign Donors
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Chinese Campaign Donors", 3, 0, 2, 3, IMAGE_PATH + "ChineseCampaignDonors.png", GroupCard.Arrow.RIGHT, outwardArrows, GroupCard.Alignment.COMMUNIST);				
		deck.add(groupCard);
		
		//C.I.A.
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		alignments.add(GroupCard.Alignment.VIOLENT);
		groupCard = new GroupCard("C.I.A.", 6, 4, 5, 0, IMAGE_PATH + "CIA.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);				
		deck.add(groupCard);

		//Clone Arrangers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.COMMUNIST);
		alignments.add(GroupCard.Alignment.CRIMINAL);
		groupCard = new GroupCard("Clone Arrangers", 6, 2, 6, 1, IMAGE_PATH + "CloneArrangers.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);				
		deck.add(groupCard);
		
		//Comic Books
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.VIOLENT);
		groupCard = new GroupCard("Comic Books",1,0,1,2, IMAGE_PATH + "ComicBooks.png", GroupCard.Arrow.LEFT, outwardArrows,alignments);
		deck.add(groupCard);
		
		//Congressional Wives
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("Congressional Wives",1,0,4,1,IMAGE_PATH + "CongressionalWives.png",GroupCard.Arrow.LEFT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Convenience Stores
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("Convenience Stores",1,0,4,3,IMAGE_PATH + "ConvenienceStores.png",GroupCard.Arrow.LEFT,outwardArrows,alignments);
<<<<<<< HEAD
		GroupCard convenienceStores = groupCard;
=======
>>>>>>> origin/master
		deck.add(groupCard);
		
		//CopyShops
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.PEACEFUL);
		groupCard = new GroupCard("Copy Shops",1,0,3,4,IMAGE_PATH + "CopyShops.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Cycle Gangs
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.WEIRD);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, Global.AttackType.DESTROY, 4);
		groupCard = new GroupCard("Cycle Gangs",0,0,4,0,IMAGE_PATH + "CycleGangs.png",GroupCard.Arrow.LEFT,null,alignments, ability);
		GroupCard cycleGangs = groupCard;
		deck.add(groupCard);
		
		//Democrats
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Democrats",5,0,4,3,IMAGE_PATH + "Democrats.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.LIBERAL);
		deck.add(groupCard);
		
		//Eco-Guerrillas
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.LIBERAL);
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("Eco-Guerrillas",0,0,6,1,IMAGE_PATH + "EcoGuerrillas.png",GroupCard.Arrow.RIGHT,null,alignments);
		deck.add(groupCard);
		
		//Empty Vee
		alignments = new ArrayList<GroupCard.Alignment>();
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Empty Vee",3,0,3,4,IMAGE_PATH + "EmptyVee.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		GroupCard emptyVee = groupCard;
		deck.add(groupCard);
		
		//Fast Food Chains
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Fast Food Chains",2,0,4,3,IMAGE_PATH + "FastFoodChains.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.STRAIGHT);
		deck.add(groupCard);
		
		//F.B.I
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("F.B.I",4,2,6,0,IMAGE_PATH + "FBI.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Federal Reserve
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groupCard = new GroupCard("Federal Reserve",5,3,7,6,IMAGE_PATH + "FederalReserve.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.GOVERNMENT);
		deck.add(groupCard);
		
		//Feminists
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, GroupCard.Alignment.LIBERAL, Global.AttackType.CONTROL, 3);
		groupCard = new GroupCard("Feminists",2,0,2,1,IMAGE_PATH + "Feminists.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.LIBERAL, ability);
		deck.add(groupCard);
		
		//Fiendish Fluoridators
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.COMMUNIST);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Fiendish Fluoridators",3,0,5,1,IMAGE_PATH + "FiendishFluoridators.png",GroupCard.Arrow.LEFT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Flat Earthers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		groupCard = new GroupCard("Flat Earthers",1,0,2,1,IMAGE_PATH + "FlatEarthers.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Fnord Motor Company
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groupCard = new GroupCard("Fnord Motor Company",2,0,4,2,IMAGE_PATH + "FnordMotorCompany.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.PEACEFUL);
		deck.add(groupCard);
		
		//Fraternal Orders
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		groupCard = new GroupCard("Fraternal Orders",3,0,5,2,IMAGE_PATH + "FraternalOrders.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.CONSERVATIVE);
		deck.add(groupCard);
		
		//Girlie Magazines
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Girlie Magazines",2,0,2,3,IMAGE_PATH + "GirlieMagazines.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.LIBERAL);
		deck.add(groupCard);
		
		//Goldfish Fanciers
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.PEACEFUL);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Goldfish Fanciers",0,0,4,1,IMAGE_PATH + "GoldfishFanciers.png",GroupCard.Arrow.LEFT,null,alignments);
		deck.add(groupCard);
		
		//Gun Lobby
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.VIOLENT);
		//groupCard = new GroupCard("Gun Lobby",1,0,*,1,IMAGE_PATH + "GunLobby.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		//deck.add(groupCard);
		
		//Hackers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.FANATIC);
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, Global.AttackType.NEUTRALIZE, 3);
		groupCard = new GroupCard("Hackers",1,1,4,2,IMAGE_PATH + "Hackers.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments, ability);
		deck.add(groupCard);
		
		//Health Food Stores
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, antiNuclearActivists, Global.AttackType.CONTROL, 2);
		groupCard = new GroupCard("Health Food Stores",1,0,3,2,IMAGE_PATH + "HealthFoodStores.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.LIBERAL, ability);
		deck.add(groupCard);
		
		//Hollywood
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groupCard = new GroupCard("Hollywood",2,0,0,5,IMAGE_PATH + "Hollywood.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.LIBERAL);
		GroupCard hollywood = groupCard;
		deck.add(groupCard);
		
		//Intellectuals
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Intellectuals",0,0,3,1,IMAGE_PATH + "Intellectuals.png",GroupCard.Arrow.LEFT,null,alignments);
		deck.add(groupCard);
		
		//International Communist Conspiracy
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, GroupCard.Alignment.COMMUNIST, Global.AttackType.CONTROL, 3);
		groupCard = new GroupCard("International Communist Conspiracy",7,0,8,6,IMAGE_PATH + "InternationalCommunistConspiracy.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.COMMUNIST, ability);
		deck.add(groupCard);
		
=======
		groupCard = new GroupCard("Cycle Gangs",0,0,4,0,IMAGE_PATH + "CycleGangs.png",GroupCard.Arrow.LEFT,null,alignments);
		deck.add(groupCard);
		
		//Democrats
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Democrats",5,0,4,3,IMAGE_PATH + "Democrats.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.LIBERAL);
		deck.add(groupCard);
		
		//Eco-Guerrillas
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.LIBERAL);
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("Eco-Guerrillas",0,0,6,1,IMAGE_PATH + "EcoGuerrillas.png",GroupCard.Arrow.RIGHT,null,alignments);
		deck.add(groupCard);
		
		//Empty Vee
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		//groupCard = new GroupCard("Empty Vee",3,0,3,4,IMAGE_PATH + "EmptyVee.png",GroupCard.Arrow.RIGHT,outwardArrows,null);
		//deck.add(groupCard);
		
		//Evil Geniuses for a Better Tomorrow
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("Evil Geniuses for a Better Tomorrow",0,2,6,3,IMAGE_PATH + "EvilGeniusesForABetterTomorrow.png",GroupCard.Arrow.RIGHT,null,alignments);
		deck.add(groupCard);
		
		//Fast Food Chains
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Fast Food Chains",2,0,4,3,IMAGE_PATH + "FastFoodChains.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.STRAIGHT);
		deck.add(groupCard);
		
		//F.B.I
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("F.B.I",4,2,6,0,IMAGE_PATH + "FBI.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Federal Reserve
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groupCard = new GroupCard("Federal Reserve",5,3,7,6,IMAGE_PATH + "FederalReserve.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.GOVERNMENT);
		deck.add(groupCard);
		
		//Feminists
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Feminists",2,0,2,1,IMAGE_PATH + "Feminists.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.LIBERAL);
		deck.add(groupCard);
		
		//Fiendish Fluoridators
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.COMMUNIST);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Fiendish Fluoridators",3,0,5,1,IMAGE_PATH + "FiendishFluoridators.png",GroupCard.Arrow.LEFT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Flat Earthers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		groupCard = new GroupCard("Flat Earthers",1,0,2,1,IMAGE_PATH + "FlatEarthers.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Fnord Motor Company
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groupCard = new GroupCard("Fnord Motor Company",2,0,4,2,IMAGE_PATH + "FnordMotorCompany.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.PEACEFUL);
		deck.add(groupCard);
		
		//Fraternal Orders
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		groupCard = new GroupCard("Fraternal Orders",3,0,5,2,IMAGE_PATH + "FraternalOrders.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.CONSERVATIVE);
		deck.add(groupCard);
		
		//Girlie Magazines
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Girlie Magazines",2,0,2,3,IMAGE_PATH + "GirlieMagazines.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.LIBERAL);
		deck.add(groupCard);
		
		//Goldfish Fanciers
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.PEACEFUL);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Goldfish Fanciers",0,0,4,1,IMAGE_PATH + "GoldfishFanciers.png",GroupCard.Arrow.LEFT,null,alignments);
		deck.add(groupCard);
		
		//Gun Lobby
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.VIOLENT);
		//groupCard = new GroupCard("Gun Lobby",1,0,*,1,IMAGE_PATH + "GunLobby.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		//deck.add(groupCard);
		
		//Hackers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Hackers",1,1,4,2,IMAGE_PATH + "Hackers.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Health Food Stores
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("Health Food Stores",1,0,3,2,IMAGE_PATH + "HealthFoodStores.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.LIBERAL);
		deck.add(groupCard);
		
		//Hollywood
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groupCard = new GroupCard("Hollywood",2,0,0,5,IMAGE_PATH + "Hollywood.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.LIBERAL);
		deck.add(groupCard);
		
		//Intellectuals
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Intellectuals",0,0,3,1,IMAGE_PATH + "Intellectuals.png",GroupCard.Arrow.LEFT,null,alignments);
		deck.add(groupCard);
		
		//International Cocaine Smugglers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groupCard = new GroupCard("International Cocaine Smugglers",3,0,5,5,IMAGE_PATH + "InternationalCocaineSmugglers.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.CRIMINAL);
		deck.add(groupCard);
		
		//International Communist Conspiracy
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		groupCard = new GroupCard("International Communist Conspiracy",7,0,8,6,IMAGE_PATH + "InternationalCommunistConspiracy.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.COMMUNIST);
		deck.add(groupCard);
		
>>>>>>> origin/master
		//I.R.S
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CRIMINAL);
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		//groupCard = new GroupCard("I.R.S",5,3,5,*,IMAGE_PATH + "IRS.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		//deck.add(groupCard);
		
<<<<<<< HEAD
=======
		//Junk Mail
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		groupCard = new GroupCard("Junk Mail",1,0,3,2,IMAGE_PATH + "JunkMail.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.CRIMINAL);
		deck.add(groupCard);
		
>>>>>>> origin/master
		//KGB
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.COMMUNIST);
		alignments.add(GroupCard.Alignment.VIOLENT);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, Global.AttackType.DESTROY, 2);
		groupCard = new GroupCard("KGB",2,2,6,0,IMAGE_PATH + "KGB.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments, ability);
=======
		groupCard = new GroupCard("KGB",2,2,6,0,IMAGE_PATH + "KGB.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
>>>>>>> origin/master
		deck.add(groupCard);
		
		//KKK
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.VIOLENT);
		groupCard = new GroupCard("KKK",2,0,5,1,IMAGE_PATH + "KKK.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);
		
<<<<<<< HEAD
=======
		//L-4 Society
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		groupCard = new GroupCard("L-4 Society",1,0,2,0,IMAGE_PATH + "L4Society.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.WEIRD);
		deck.add(groupCard);
		
>>>>>>> origin/master
		//Libertarians
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		groupCard = new GroupCard("Libertarians",1,0,4,1,IMAGE_PATH + "Libertarians.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.FANATIC);
		deck.add(groupCard);
		
		//Loan Sharks
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CRIMINAL);
		alignments.add(GroupCard.Alignment.VIOLENT);
		groupCard = new GroupCard("Loan Sharks",5,0,5,6,IMAGE_PATH + "LoanSharks.png",GroupCard.Arrow.LEFT,outwardArrows,alignments);
		deck.add(groupCard);
		
		//Local Police Departments
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		alignments.add(GroupCard.Alignment.VIOLENT);
		groupCard = new GroupCard("Local Police Departments",0,0,4,1,IMAGE_PATH + "LocalPoliceDepartments.png",GroupCard.Arrow.LEFT,null,alignments);
		deck.add(groupCard);
		
		//Madison Avenue
<<<<<<< HEAD
		alignments = new ArrayList<GroupCard.Alignment>();
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groups = new ArrayList<GroupCard>();
		groups.add(bigMedia);
		groups.add(emptyVee);
		ability = new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, groups, Global.AttackType.ALL, 4);
		groupCard = new GroupCard("Madison Avenue",3,3,3,2,IMAGE_PATH + "MadisonAvenue.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments, ability);
		deck.add(groupCard);
=======
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		//groupCard = new GroupCard("Madison Avenue",3,3,3,2,IMAGE_PATH + "MadisonAvenue.png",GroupCard.Arrow.RIGHT,outwardArrows,null);
		//deck.add(groupCard);
>>>>>>> origin/master
		
		//The Mafia
		ability = new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, GroupCard.Alignment.CRIMINAL, Global.AttackType.CONTROL, 3);
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("The Mafia", 7, 0, 7, 6, IMAGE_PATH + "TheMafia.png", GroupCard.Arrow.RIGHT, outwardArrows, GroupCard.Alignment.CRIMINAL, ability);				
		deck.add(groupCard);
		
		//The Men In Black
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CRIMINAL);
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("The Men In Black",0,2,6,1, IMAGE_PATH + "TheMenInBlack.png", GroupCard.Arrow.LEFT, null, alignments);
		deck.add(groupCard);

		//Militia
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, GroupCard.Alignment.COMMUNIST, Global.AttackType.DESTROY, 6);
		groupCard = new GroupCard("Militia",2,0,4,2, IMAGE_PATH + "Militia.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments, ability);
=======
		groupCard = new GroupCard("Militia",2,0,4,2, IMAGE_PATH + "Militia.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
>>>>>>> origin/master
		deck.add(groupCard);

		//Moonies
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.PEACEFUL);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Moonies",2,0,4,2, IMAGE_PATH + "Moonies.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);
		deck.add(groupCard);

		//Moral Minority
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Moral Minority",2,0,1,2, IMAGE_PATH + "MoralMinority.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
<<<<<<< HEAD
		GroupCard moralMinority = groupCard;
=======
>>>>>>> origin/master
		deck.add(groupCard);

		//Morticians
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.STRAIGHT);
		alignments.add(GroupCard.Alignment.PEACEFUL);
		groupCard = new GroupCard("Morticians",0,0,4,1, IMAGE_PATH + "Morticians.png", GroupCard.Arrow.RIGHT, null, alignments);
		deck.add(groupCard);

		//Multinational Oil Companies
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		//groupCard = new GroupCard("Multinational Oil Companies",6,0,4,8, IMAGE_PATH + "MultinationalOilCompanies.png", GroupCard.Arrow.LEFT, outwardArrows, null);
		//deck.add(groupCard);

		//Nephews of God
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Nephews of God",0,0,4,2, IMAGE_PATH + "NephewsOfGod.png", GroupCard.Arrow.RIGHT, null, alignments);
		deck.add(groupCard);

		//New York
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.CRIMINAL);
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		groupCard = new GroupCard("New York",7,0,8,3, IMAGE_PATH + "NewYork.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
		deck.add(groupCard);

		//Nuclear Power Companies
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		groupCard = new GroupCard("Nuclear Power Companies",4,0,4,3, IMAGE_PATH + "NuclearPowerCompanies.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
		deck.add(groupCard);

		//Orbital Mind Control Lasers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.COMMUNIST);
		groupCard = new GroupCard("Oribital Mind Control Lasers",4,2,5,0, IMAGE_PATH + "OrbitalMindControlLasers.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);
<<<<<<< HEAD
		GroupCard orbitalMindControlLasers = groupCard;
		deck.add(groupCard);
		
		//Evil Geniuses for a Better Tomorrow
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.WEIRD);
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, orbitalMindControlLasers, Global.AttackType.ALL, 4);
		groupCard = new GroupCard("Evil Geniuses for a Better Tomorrow", 2, 0, 5, 1, IMAGE_PATH + "EvilGeniusesForABetterTomorrow.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments, ability);				
		deck.add(groupCard);
		
		//L-4 Society
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		ability = new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, orbitalMindControlLasers, Global.AttackType.ALL, 4);
		groupCard = new GroupCard("L-4 Society",1,0,2,0,IMAGE_PATH + "L4Society.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.WEIRD, ability);
=======
>>>>>>> origin/master
		deck.add(groupCard);

		//Parent/TeacherAglomeration
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.PEACEFUL);
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("Parent/Teacher Aglomeration",0,0,5,1, IMAGE_PATH + "ParentTeacherAggolmeration.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);
		deck.add(groupCard);

		//Pentagon
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("Pentagon",6,0,6,2, IMAGE_PATH + "Pentagon.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
		deck.add(groupCard);

		//The Phone Company
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		groupCard = new GroupCard("The Phone Company",5,2,6,3, IMAGE_PATH + "ThePhoneCompany.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);
<<<<<<< HEAD
		GroupCard thePhoneCompany = groupCard;
=======
>>>>>>> origin/master
		deck.add(groupCard);

		//Phone Phreaks
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CRIMINAL);
		alignments.add(GroupCard.Alignment.LIBERAL);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, thePhoneCompany, Global.AttackType.ALL, 3);
		groupCard = new GroupCard("Phone Phreaks",0,1,1,1, IMAGE_PATH + "PhonePhreaks.png", GroupCard.Arrow.LEFT, null, alignments, ability);
=======
		groupCard = new GroupCard("Phone Phreaks",0,1,1,1, IMAGE_PATH + "PhonePhreaks.png", GroupCard.Arrow.LEFT, null, alignments);
>>>>>>> origin/master
		deck.add(groupCard);

		//Post Office
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		groupCard = new GroupCard("Post Office",4,3,3,1, IMAGE_PATH + "PostOffice.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
<<<<<<< HEAD
		GroupCard postOffice = groupCard;
		deck.add(groupCard);
		
		//Junk Mail
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, postOffice, Global.AttackType.CONTROL, 4);
		groupCard = new GroupCard("Junk Mail",1,0,3,2,IMAGE_PATH + "JunkMail.png",GroupCard.Arrow.RIGHT,outwardArrows,GroupCard.Alignment.CRIMINAL, ability);
=======
>>>>>>> origin/master
		deck.add(groupCard);

		//Professional Sports
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Professional Sports", 2,0,4,3, IMAGE_PATH + "ProfessionalSports.png", GroupCard.Arrow.LEFT, outwardArrows, alignments);
		deck.add(groupCard);

		//Psychiatrists
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("Psychiatrists",0,0,6,2, IMAGE_PATH + "Psychiatrists.png", GroupCard.Arrow.RIGHT, null, alignments);
		deck.add(groupCard);

		//Punk Rockers
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("Punk Rockers",0,0,4,1, IMAGE_PATH + "PunkRockers.png", GroupCard.Arrow.LEFT, null, alignments);
<<<<<<< HEAD
		GroupCard punkRockers = groupCard;
		deck.add(groupCard);
		
		//International Cocaine Smugglers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		groups = new ArrayList<GroupCard>();
		groups.add(punkRockers);
		groups.add(cycleGangs);
		groups.add(hollywood);
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, groups, Global.AttackType.CONTROL, 4);
		groupCard = new GroupCard("International Cocaine Smugglers",3,0,5,5,IMAGE_PATH + "InternationalCocaineSmugglers.png",GroupCard.Arrow.LEFT,outwardArrows,GroupCard.Alignment.CRIMINAL, ability);
=======
>>>>>>> origin/master
		deck.add(groupCard);

		//Recyclers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.LIBERAL);
		groupCard = new GroupCard("Recyclers",2,0,2,3,IMAGE_PATH + "Recyclers.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
		deck.add(groupCard);

		//Republicans
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		groupCard = new GroupCard("Republicans",4,0,4,4, IMAGE_PATH + "Republicans.png", GroupCard.Arrow.RIGHT, outwardArrows, alignments);
		deck.add(groupCard);

		//Robot Sea Monsters
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.COMMUNIST);
		groupCard = new GroupCard("Robot Sea Monsters", 0,0,6,2, IMAGE_PATH + "RobertSeaMonsters.png", GroupCard.Arrow.RIGHT,null,alignments);
		deck.add(groupCard);

		//Science Fiction Fans
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, GroupCard.Alignment.WEIRD, Global.AttackType.CONTROL, 2);
		groupCard = new GroupCard("Science Fiction Fans",0,0,5,1, IMAGE_PATH + "ScienceFictionFans.png",GroupCard.Arrow.LEFT,null,alignments, ability);
		GroupCard sfFans = groupCard;
=======
		groupCard = new GroupCard("Science Fiction Fans",0,0,5,1, IMAGE_PATH + "ScienceFictionFans.png",GroupCard.Arrow.LEFT,null,alignments);
>>>>>>> origin/master
		deck.add(groupCard);

		//Semiconscious Liberation Army
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CRIMINAL);
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.LIBERAL);
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.COMMUNIST);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.ANY_ATTEMPT, Global.AttackType.DESTROY, 1);
		groupCard = new GroupCard("Semiconscious Liberation Army",0,0,8,0, IMAGE_PATH + "SemiconsciousLiberationArmy.png",GroupCard.Arrow.LEFT,null,alignments, ability);
=======
		groupCard = new GroupCard("Semiconscious Liberation Army",0,0,8,0, IMAGE_PATH + "SemiconsciousLiberationArmy.png",GroupCard.Arrow.LEFT,null,alignments);
		deck.add(groupCard);

		//S.M.O.F
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("S.M.O.F",1,0,1,0, IMAGE_PATH + "SMOF.png", GroupCard.Arrow.RIGHT,outwardArrows,alignments);
>>>>>>> origin/master
		deck.add(groupCard);

		//Society for Creative Anarchism
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.WEIRD);
		groupCard = new GroupCard("Society for Creative Anarchism",0,0,4,1, IMAGE_PATH + "SocietyForCreativeAnarchism.png",GroupCard.Arrow.RIGHT,null,alignments);
		deck.add(groupCard);

		//South American Nazis
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.VIOLENT);
		groupCard = new GroupCard("South American Nazis",4,0,6,2, IMAGE_PATH + "SouthAmericanNazis.png", GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);

		//Survivalists
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Survivalists",0,0,6,2,IMAGE_PATH + "Survivalists.png", GroupCard.Arrow.RIGHT,null,alignments);
		deck.add(groupCard);

		//Tabloids
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, convenienceStores, Global.AttackType.CONTROL, 3);
		groupCard = new GroupCard("Tabloids",2,0,3,3,IMAGE_PATH + "Tabloids.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments, ability);
=======
		groupCard = new GroupCard("Tabloids",2,0,3,3,IMAGE_PATH + "Tabloids.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
>>>>>>> origin/master
		deck.add(groupCard);

		//Texas
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.RIGHT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.VIOLENT);
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		alignments.add(GroupCard.Alignment.GOVERNMENT);
		groupCard = new GroupCard("Texas",6,0,6,4,IMAGE_PATH + "Texas.png",GroupCard.Arrow.LEFT,outwardArrows,alignments);
		deck.add(groupCard);

		//Taboacoo & Liquor Comapnies
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.LEFT);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("Tabacco & Liquor Companies",4,0,3,3,IMAGE_PATH + "TobaccoAndLiquorCompanies.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);

		//Trekkies
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		alignments.add(GroupCard.Alignment.FANATIC);
		groupCard = new GroupCard("Trekkies",0,0,4,3,IMAGE_PATH + "Trekkies.png",GroupCard.Arrow.RIGHT,null,alignments);
<<<<<<< HEAD
		GroupCard trekkies = groupCard;
		deck.add(groupCard);
		
		//S.M.O.F
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.WEIRD);
		ArrayList<BasicGroupAbility> abilities = new ArrayList<BasicGroupAbility>();
		abilities.add(new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, sfFans, Global.AttackType.CONTROL, 5));
		abilities.add(new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, trekkies, Global.AttackType.CONTROL, 2));
		groupCard = new GroupCard("S.M.O.F",1,0,1,0, IMAGE_PATH + "SMOF.png", GroupCard.Arrow.RIGHT,outwardArrows,alignments, abilities);
=======
>>>>>>> origin/master
		deck.add(groupCard);

		//Triliberal Commission
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.LIBERAL);
		alignments.add(GroupCard.Alignment.STRAIGHT);
		groupCard = new GroupCard("Triliberal Commission",5,0,6,3,IMAGE_PATH + "TriliberalCommission.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);

		//TV Preachers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.STRAIGHT);
		alignments.add(GroupCard.Alignment.FANATIC);
<<<<<<< HEAD
		ability = new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, moralMinority, Global.AttackType.CONTROL, 3);
		groupCard = new GroupCard("TV Preachers",3,0,6,4,IMAGE_PATH + "TVPreachers.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments, ability);
=======
		groupCard = new GroupCard("TV Preachers",3,0,6,4,IMAGE_PATH + "TVPreachers.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
>>>>>>> origin/master
		deck.add(groupCard);

		//Undergroup Newspapers
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.TOP);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.COMMUNIST);
		alignments.add(GroupCard.Alignment.LIBERAL);
		groupCard = new GroupCard("Underground Newspapers",1,1,5,0,IMAGE_PATH + "UndergroundNewspapers.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);
		deck.add(groupCard);

		//The United Nations
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.LIBERAL);
		groupCard = new GroupCard("The United Nations",1,0,3,3,IMAGE_PATH + "TheUnitedNations.png",GroupCard.Arrow.LEFT,outwardArrows,alignments);
		deck.add(groupCard);

		//Video Games
<<<<<<< HEAD
		alignments = new ArrayList<GroupCard.Alignment>();
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		ability = new BasicGroupAbility(Global.AbilityType.DIRECT_CONTROL, convenienceStores, Global.AttackType.CONTROL, 3);
		groupCard = new GroupCard("Video Games",2,0,3,7,IMAGE_PATH + "VideoGames.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments, ability);
		deck.add(groupCard);
=======
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		//groupCard = new GroupCard("Video Games",2,0,3,7,IMAGE_PATH + "VideoGames.png",GroupCard.Arrow.RIGHT,outwardArrows,null);
		//deck.add(groupCard);
>>>>>>> origin/master

		//YUppies
		outwardArrows = new ArrayList<GroupCard.Arrow>();
		outwardArrows.add(GroupCard.Arrow.BOTTOM);
		alignments = new ArrayList<GroupCard.Alignment>();
		alignments.add(GroupCard.Alignment.CONSERVATIVE);
		groupCard = new GroupCard("Yuppies",1,1,4,5,IMAGE_PATH + "Yuppies.png",GroupCard.Arrow.RIGHT,outwardArrows,alignments);


		
		//------------------------------CREATE ILLUMINATI CARDS----------------------------------------------
		
		IlluminatiCard illuminatiCard;
		
		//The Society of Assassins
		illuminatiCard = new IlluminatiCard("The Society of Assassins", 8, 8, 8, IMAGE_PATH + "TheSocietyOfAssassins.png");
		illuminatiDeck.add(illuminatiCard);
		
		//The Network
		illuminatiCard = new IlluminatiCard("The Network", 7, 7, 9, IMAGE_PATH + "TheNetwork.png");
		illuminatiDeck.add(illuminatiCard);
		
		//The Discordian Society
		illuminatiCard = new IlluminatiCard("The Discordian Society", 8, 8, 8, IMAGE_PATH + "TheDiscordianSociety.png");
		illuminatiDeck.add(illuminatiCard);
		
		//The UFOs
		illuminatiCard = new IlluminatiCard("The UFOs", 6, 6, 8, IMAGE_PATH + "TheUFOs.png");
		illuminatiDeck.add(illuminatiCard);
		
		//The Servants of Cthulhu
		illuminatiCard = new IlluminatiCard("The Servants of Cthulhu", 9, 9, 7, IMAGE_PATH + "TheServantsOfCthulhu.png");
		illuminatiDeck.add(illuminatiCard);
		
		//The Gnomes of Zurich
		illuminatiCard = new IlluminatiCard("The Gnomes of Zurich", 7, 7, 12, IMAGE_PATH + "TheGnomesOfZurich.png");
		illuminatiDeck.add(illuminatiCard);
		
		//The Bavarian Illuminati
		illuminatiCard = new IlluminatiCard("The Bavarian Illuminati", 10, 10, 8, IMAGE_PATH + "TheBavarianIlluminati.png");
		illuminatiDeck.add(illuminatiCard);
		
		//The Bermuda Triangle
		illuminatiCard = new IlluminatiCard("The Bermuda Triangle", 8, 8, 9, IMAGE_PATH + "TheBermudaTriangle.png");
		illuminatiDeck.add(illuminatiCard);

		//String name, int power, int transferablePower, int income, String imagePath,
		//  Arrow inwardArrow
		
		//-------------------------------CREATE SPECIAL CARDS------------------------------------------------
		
		SpecialCard specialCard;
		
		//Assassination
		specialCard = new SpecialCard("Assassination", IMAGE_PATH + "Assassination.png");
		deck.add(specialCard);
		
		//Bribery
		specialCard = new SpecialCard("Bribery", IMAGE_PATH + "Bribery.png");
		deck.add(specialCard);
		
		//Computer Espionage
		specialCard = new SpecialCard("Computer Espionage", IMAGE_PATH + "ComputerEspionage.png");
		deck.add(specialCard);
		
		//Deep Agent
		specialCard = new SpecialCard("Deep Agent", IMAGE_PATH + "DeepAgent.png");
		deck.add(specialCard);
		
		//Interference
		specialCard = new SpecialCard("Interference", IMAGE_PATH + "Interference.png");
		deck.add(specialCard);
		
		//Interference2
		specialCard = new SpecialCard("Interference", IMAGE_PATH + "Interference2.png");
		deck.add(specialCard);
		
		//Market Manipulation
		specialCard = new SpecialCard("Market Manipulation", IMAGE_PATH + "MarketManipulation.png");
		deck.add(specialCard);
		
		//Media Campaign
		specialCard = new SpecialCard("Media Campaign", IMAGE_PATH + "MediaCampaign.png");
		deck.add(specialCard);
		
		//Murphy's Law
		specialCard = new SpecialCard("Murphy's Law", IMAGE_PATH + "MurphysLaw.png");
		deck.add(specialCard);
		
		//Secrets Man Was Not Meant To Know
		specialCard = new SpecialCard("Secrets Man Was Not Meant To Know", IMAGE_PATH + "SecretsManWasNotMeantToKnow.png");
		deck.add(specialCard);
		
		//Senate Investigating Committee
		specialCard = new SpecialCard("Senate Investigating Committee", IMAGE_PATH + "SenateInvestigatingCommittee.png");
		deck.add(specialCard);
		
		//Slush Fund
		specialCard = new SpecialCard("Slush Fund", IMAGE_PATH + "SlushFund.png");
		deck.add(specialCard);
		
		//Swiss Bank Account
		specialCard = new SpecialCard("Swiss Bank Account", IMAGE_PATH + "SwissBankAccount.png");
		deck.add(specialCard);
		
		//Whispering Campaign
		specialCard = new SpecialCard("Whispering Campaign", IMAGE_PATH + "WhisperingCampaign.png");
		deck.add(specialCard);
		
		//White Collar Crime
		specialCard = new SpecialCard("White Collar Crime", IMAGE_PATH + "WhiteCollarCrime.png");
		deck.add(specialCard);
	}
	
	//Randomly returns an IlluminatiCard contained in illuminatiDeck
	//Returns null if illuminatiDeck is empty
	public IlluminatiCard drawIlluminati(){
		if(illuminatiDeck.size() > 0){
			return illuminatiDeck.remove(0);
		}
		return null;
	}
	
	//Randomizes the order of the deck
	public void shuffleDeck(){
		Collections.shuffle(deck);
		Collections.shuffle(illuminatiDeck);
	}
	
	//Removes and returns the top (first) card in the deck.
	//Returns null if deck is empty
	public MainDeckCard drawCard(){
		if(deck.size() > 0){
			return deck.remove(0);
		}
		return null;
	}
	
	public void returnCard(MainDeckCard card){
		deck.add(card);
	}

	@Override
	public String toString() {
		return "Deck [deck=" + deck + ", illuminatiDeck=" + illuminatiDeck + "]";
	}
}
