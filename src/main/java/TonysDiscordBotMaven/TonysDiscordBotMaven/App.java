package TonysDiscordBotMaven.TonysDiscordBotMaven;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.exceptions.PermissionException;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.entities.Message;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.entities.User;
import net.dv8tion.jda.core.entities.MessageChannel;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDABuilder;
import javax.security.auth.login.LoginException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.util.Properties;
import java.util.Set;

import com.sedmelluq.discord.lavaplayer.player.AudioPlayer;
import com.sedmelluq.discord.lavaplayer.player.AudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.player.DefaultAudioPlayerManager;
import com.sedmelluq.discord.lavaplayer.source.AudioSourceManagers;

import net.dv8tion.jda.core.entities.Game;

public class App extends ListenerAdapter {

	public static void main (String[] args) throws LoginException, IllegalArgumentException, IOException, InterruptedException, RateLimitedException{
		try {
			JDA api = new JDABuilder(AccountType.BOT).setToken("NTM5NjM3MzQzMjc1OTc0Njcx.DzFVFQ._qhCddl5eqpc202vwYcEXW1hBdA").setAudioEnabled(true).setAutoReconnect(true).buildBlocking();
			api.addEventListener(new App());
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
		public void onMessageReceived(MessageReceivedEvent event) {
			if (event.getAuthor().isBot()) return;
			
			Game.playing("type help");
			
			String currentUser = event.getAuthor().getId();

			Message message = event.getMessage();
			String content = message.getContentRaw();
			MessageChannel channel = event.getChannel();
			String plainText = content;
			String checkForWord = "";
			String [] numberForRoll = content.split(" ");
			int orangeChance = (int)(Math.random()*900 + 1);
			
			
				//Check if specific word is in sentence
				for (int i = 0; i < numberForRoll.length; i++) {
					if (numberForRoll[i].equalsIgnoreCase("ahegao")) {
						checkForWord = "ahegao";
					}
				}
			
				//When ping is said itll say the ping
				if (plainText.equalsIgnoreCase("ping")){
				channel.sendMessage("pong " + event.getJDA().getPing()).queue();
			}
				
				//some copypasta
				if (plainText.equalsIgnoreCase("You say our country was CONQUERED when it was not, it was INVADED, not CONQUERED, and you say we invented nothing, BUT WE INVENTED FUCKING PLASTIC, we co-invented the WORLD WIDE WEB, we invented FUCKING JPEG... and you know ASPHALT? Who invented it? BELGIANS!!! And who made the blueprints for the Atlas Rocket you sent into space? A BELGIAN ENGINEER, so stfu about us not inventing shit cuz we did retards")){
				channel.sendMessage("You dumb fucking cretin, you fucking fool, absolute fucking buffoon, you bumbling idiot. Fuck you.").queue();
			}
				
				//When face is said itll show ahego face
				if (checkForWord == "ahegao"){
				channel.sendMessage("⠄⢰⣧⣼⣯⠄⣸⣠⣶⣶⣦⣾⠄⢸⡇⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠\n"+
									" ⠄⣾⣿⠿⠿⠶⠿⢿⣿⣿⣿⣿⣦⣤⣄⢀⡅⢠⣾⣛⡉⠄⠄⠄⠸⢀⣿⠄\n"+
									" ⢀⡋⣡⣴⣶⣶⡀⠄⠄⠙⢿⣿⣿⣿⣿⣿⣴⣿⣿⣿⢃⣤⣄⣀⣥⣿⣿⠄\n"+
									" ⢸⣇⠻⣿⣿⣿⣧⣀⢀⣠⡌⢻⣿⣿⣿⣿⣿⣿⣿⣿⣿⠿⠿⠿⣿⣿⣿⠄\n"+
									" ⢸⣿⣷⣤⣤⣤⣬⣙⣛⢿⣿⣿⣿⣿⣿⣿⡿⣿⣿⡍⠄⠄⢀⣤⣄⠉⠋⣰\n"+
									" ⣖⣿⣿⣿⣿⣿⣿⣿⣿⣿⢿⣿⣿⣿⣿⣿⢇⣿⣿⡷⠶⠶⢿⣿⣿⠇⢀⣤ \n"+
									"⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣽⣿⣿⣿⡇⣿⣿⣿⣿⣿⣿⣷⣶⣥⣴⣿⡗\n"+
									" ⢿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⣿⡟⠄\n"+
									" ⣦⣌⣛⣻⣿⣿⣧⠙⠛⠛⡭⠅⠒⠦⠭⣭⡻⣿⣿⣿⣿⣿⣿⣿⣿⡿⠃⠄\n"+
									" ⣿⣿⣿⣿⣿⣿⣿⡆⠄⠄⠄⠄⠄⠄⠄⠄⠹⠈⢋⣽⣿⣿⣿⣿⣵⣾⠃⠄\n"+
									" ⣿⣿⣿⣿⣿⣿⣿⣿⠄⣴⣿⣶⣄⠄⣴⣶⠄⢀⣾⣿⣿⣿⣿⣿⣿⠃⠄⠄ \n"+
									"⠈⠻⣿⣿⣿⣿⣿⣿⡄⢻⣿⣿⣿⠄⣿⣿⡀⣾⣿⣿⣿⣿⣛⠛⠁⠄⠄⠄\n"+
									" ⠄⠄⠈⠛⢿⣿⣿⣿⠁⠞⢿⣿⣿⡄⢿⣿⡇⣸⣿⣿⠿⠛⠁⠄⠄⠄⠄⠄\n"+
									" ⠄⠄⠄⠄⠄⠉⠻⣿⣿⣾⣦⡙⠻⣷⣾⣿⠃⠿⠋⠁⠄⠄⠄⠄⠄⢀⣠⣴\n"+
									" ⣿⣶⣶⣮⣥⣒⠲⢮⣝⡿⣿⣿⡆⣿⡿⠃⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⠄⣠").queue();
			}
				
				//When fuck you is said itll say >:0
				if (plainText.equalsIgnoreCase("fuck you")){
					channel.sendMessage(">:0").queue();
			}
				//make it say :)) when someone says something like i love you or you are wonderful
				if (plainText.equalsIgnoreCase("i love you")||plainText.equalsIgnoreCase("you are wonderful")||plainText.equalsIgnoreCase("i love you!")||plainText.equalsIgnoreCase("you are wonderful!")||plainText.equalsIgnoreCase("i love you!!")||plainText.equalsIgnoreCase("you are wonderful!!")){
						channel.sendMessage(":))").queue();
				}
				
				if (plainText.equalsIgnoreCase("You are lovely")||plainText.equalsIgnoreCase("You are lovely!")||plainText.equalsIgnoreCase("You are lovely!!")){
						channel.sendMessage(":))").queue();
				}
				
				if (plainText.equalsIgnoreCase("give me reputation nigga")){
					channel.sendMessage("t!rep <@143146929310793728>").queue();
			}
				
				//Randomized rolling
				if (numberForRoll[0].equalsIgnoreCase("roll")) {
					int Sides = 6;
					if (numberForRoll.length > 1) {
						Sides = Integer.valueOf(numberForRoll[1]);
					}
					channel.sendMessage("I roll: "+(int)(Math.random()*Sides + 1)).queue();
			}
				
				//When wee woo is said itll say wee woo
				if (plainText.equalsIgnoreCase("wee woo")){
					channel.sendMessage("wee woo").queue();
			}
				//When gay is said itll say your mom >:0
				if (plainText.equalsIgnoreCase("gay")){
					channel.sendMessage("your mom >:0").queue();
			}
				
				//When gay is said itll say your mom >:0
				if (plainText.equalsIgnoreCase("sans")){
					channel.sendMessage("░░░░░▄▄▀▀▀▀▀▀▀▀▀▄▄░░░░░\n"+
										"░░░░█░░░░░░░░░░░░░█░░░░\n"+
										"░░░█░░░░░░░░░░▄▄▄░░█░░░\n"+
										"░░░█░░▄▄▄░░▄░░███░░█░░░\n"+
										"░░░▄█░▄░░░▀▀▀░░░▄░█▄░░░\n"+
										"░░░█░░▀█▀█▀█▀█▀█▀░░█░░░\n"+
										"░░░▄██▄▄▀▀▀▀▀▀▀▄▄██▄░░░\n"+
										"░▄█░█▀▀█▀▀▀█▀▀▀█▀▀█░█▄░").queue();
			}
				
				if (plainText.equalsIgnoreCase("no")&&currentUser == "222397524932034560"){
					channel.sendMessage("░░░░░▄▄▀▀▀▀▀▀▀▀▀▄▄░░░░░\n"+
										"░░░░█░░░░░░░░░░░░░█░░░░\n"+
										"░░░█░░░░░░░░░░▄▄▄░░█░░░\n"+
										"░░░█░░▄▄▄░░▄░░███░░█░░░\n"+
										"░░░▄█░▄░░░▀▀▀░░░▄░█▄░░░\n"+
										"░░░█░░▀█▀█▀█▀█▀█▀░░█░░░\n"+
										"░░░▄██▄▄▀▀▀▀▀▀▀▄▄██▄░░░\n"+
										"░▄█░█▀▀█▀▀▀█▀▀▀█▀▀█░█▄░").queue();
			}
				
				//Calculate basic numbers
				else if (numberForRoll[0].equalsIgnoreCase("calculate")||numberForRoll[0].equalsIgnoreCase("calc")) {
					if (numberForRoll[2].equals("+")) {
						channel.sendMessage("Your calculation is: "+(Double.valueOf(numberForRoll[1])+Double.valueOf(numberForRoll[3]))).queue();
					}
					else if (numberForRoll[2].equalsIgnoreCase("x")) {
						channel.sendMessage("Your calculation is: "+(Double.valueOf(numberForRoll[1])*Double.valueOf(numberForRoll[3]))).queue();
					}
					else if (numberForRoll[2].equals("/")) {
						channel.sendMessage("Your calculation is: "+(Double.valueOf(numberForRoll[1])/Double.valueOf(numberForRoll[3]))).queue();
					}
					else if (numberForRoll[2].equals("-")) {
						channel.sendMessage("Your calculation is: "+(Double.valueOf(numberForRoll[1])-Double.valueOf(numberForRoll[3]))).queue();
					}
				//Calculate Quadratic Equation
					else if (numberForRoll[1].equalsIgnoreCase("A:")&&numberForRoll[3].equalsIgnoreCase("B:")&&numberForRoll[5].equalsIgnoreCase("C:")) {
						double NumberA = Double.valueOf(numberForRoll[2]);
						double NumberB = Double.valueOf(numberForRoll[4]);
						double NumberC = Double.valueOf(numberForRoll[6]);
						double NumberBSwitch = (NumberB*-1);
						double powerOfB = Math.pow(NumberB, 2);
						double sqrt1 = Math.sqrt(powerOfB-(4*NumberA*NumberC));
						double top1 = NumberBSwitch + sqrt1;
						double top2 = NumberBSwitch - sqrt1;
						double bottom = 2*NumberA;
						double answer1 = top1/bottom;
						double answer2 = top2/bottom;
						channel.sendMessage("The answers to that quadratic are: "+answer1+", "+answer2).queue();
					}
				}
				
				
				//Whips and nae naes
				if (plainText.equalsIgnoreCase("whip nae nae")) {
					channel.sendMessage("https://data.whicdn.com/images/192893052/original.gif").queue();

				}

				else if (numberForRoll[0].equalsIgnoreCase("nae") && numberForRoll[1].equalsIgnoreCase("nae")) {
					channel.sendMessage(":wave:"+"\n"+"** ** "+"** ** "+"** ** "+"\\\\ :flushed:"+"\n"+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"|| \\\\_"+"\n"+"** ** "+"** ** "+"\\_"+"/¯    ¯\\\\"+"\\_").queue();
				}
				
				else if (numberForRoll[0].equalsIgnoreCase("whip")) {
					channel.sendMessage("** ** "+"** ** "+"** ** "+"** ** "+":stuck_out_tongue_winking_eye:").queue();
					channel.sendMessage("** ** "+":punch:/||\\\\_ "+"\n"+"** ** "+"** ** "+"\\_"+"/¯    ¯\\\\"+"\\_").queue();
				}
				
				//Chance for orange saying :0
					if (orangeChance >= 898){
						channel.sendMessage(":0").queue();
					}
					else if (orangeChance <= 3) {
						channel.sendMessage(":))").queue();
					}
					
				//Bank account creation and money checking

					String currentUserBankAccount = event.getAuthor().getId();
					boolean isFileTrue = false;
					int currency = 0;
					try {
						currency = checkCurrency(currentUserBankAccount);
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					try {
					isFileTrue = checkFile(currentUserBankAccount);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					try {
						if (isFileTrue == true && getCurrentUserMoney(currentUserBankAccount) < 0) {
							setIfZero(currentUserBankAccount);
						}
					} catch (IOException e2) {
						// TODO Auto-generated catch block
						e2.printStackTrace();
					}
					
					if (isFileTrue == false && plainText.equalsIgnoreCase("bank")){
						channel.sendMessage("bank create - To create a bank account").queue();
					}
					if (isFileTrue == false && plainText.equalsIgnoreCase("money")) {
						channel.sendMessage("bank create - To create a bank account").queue();
					}
					if (plainText.equalsIgnoreCase("bank") && isFileTrue == true){
						channel.sendMessage("Balance: " + currency).queue();
					}
					if (plainText.equalsIgnoreCase("money") && isFileTrue == true) {
						channel.sendMessage("Balance: " + currency).queue();
					}

					if (plainText.equalsIgnoreCase("bank create") && isFileTrue == false) {
						
						try {
							bankCreate(event.getAuthor().getId());
							channel.sendMessage("Bank Account Succesfully Created!").queue();
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
						
				
				//Slot Machine
					int moneyPutIn = 1;
					boolean negativeCheck = false;
					try {
						negativeCheck = checkCurrencyNegative(currentUser);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					if (numberForRoll[0].equalsIgnoreCase("slots") && negativeCheck == true && isFileTrue == true) {
						if (numberForRoll.length > 1 && isFileTrue == true) {
							moneyPutIn = Integer.valueOf(numberForRoll[1]);
						}
							try {
								moneyTakeOutOfBank(currentUser, moneyPutIn);
							} catch (IOException e) {
								e.printStackTrace();
							}
						
						int number1 = (int)(Math.random()*20 + 1);
						int number2 = (int)(Math.random()*20 + 1);
						int number3 = (int)(Math.random()*20 + 1);
						channel.sendMessage("["+ number1 + "]"+"["+ number2 + "]"+"["+ number3 + "]").queue();
						if (number1 == number2 || number1 == number3 || number2 == number3) {
							channel.sendMessage("You win!").queue();
							try {
								slotWinner(currentUser, moneyPutIn);
							} catch (IOException e) {
								e.printStackTrace();
							}
						}
				}
					else if (numberForRoll[0].equalsIgnoreCase("slots") && negativeCheck == false && isFileTrue == true) {
					channel.sendMessage("Balance is too low").queue();
		}
					
				//Adding money to bank account when guy speaks
					if (isFileTrue == true){
						try {
							addAmountWhenSpeak(currentUser);
						} catch (IOException e) {
							e.printStackTrace();
						}
					}
						
				//Anime Quotes
					if (plainText.equalsIgnoreCase("give me an anime quote")|| plainText.equalsIgnoreCase("anime quote")){
						int animeQuoteNumber = (int)(Math.random()*10);
				
						String [] AnimeQuotes = new String[10];
						AnimeQuotes[0] = "\"Weaklings will stay weak forever. But weakness is not evil, since human beings are weak creatures to begin with. Alone, you feel nothing but insecurity; that’s why we form guilds, that’s why we have friends. We walk together in order to live a strong life. The clumsy ones will walk into more walls than the others, and it may also take them longer to get there. If you believe in tomorrow and put yourself out there, you can naturally obtain your strength. That’s how you will be able to smile and live strong.\"\n Makarov Dreyar (Fairy Tail)";
						AnimeQuotes[1] = "\"The true measure of a shinobi is not how he lives but how he dies. It’s not what they do in life but what they did before dying that proves their worth.\"\n Jiraiya (Naruto)";
						AnimeQuotes[2] = "\"I don’t want to conquer anything. I just think that the guy with the most freedom in this ocean is the Pirate King!\"\n Monkey D. Luffy (One Piece)";
						AnimeQuotes[3] = "\"I want you to be happy. I want you to laugh a lot. I don’t know what exactly I’ll be able to do for you, but I’ll always be by your side.\"\n Kagome (Inuyasha)";
						AnimeQuotes[4] = "\"I want…to change things. I want to believe that anything can be changed. The moment I met you, a new world opened up for me. You see, after wandering in the darkness for so long, a light brought me happiness. It’s all thanks to you.\"\n Chrono (Chrono Crusade)";
						AnimeQuotes[5] = "\"If you only face forward, there is something you will miss seeing.\"\n Vash the Stampede (Trigun)";
						AnimeQuotes[6] = "\"We are all like fireworks. We climb, shine, and always go our separate ways and become further apart. But even if that time comes, let’s not disappear like a firework, and continue to shine forever.\"\n Hitsugaya Toushiro (Bleach)";
						AnimeQuotes[7] = "\"Don’t be so quick to throw away your life. No matter how disgraceful or embarrassing it may be, you need to keep struggling to find your way out until the very end.\"\n Clare (Claymore)";
						AnimeQuotes[8] = "\"The world’s not perfect, but it’s there for us trying the best it can. That’s what makes it so damn beautiful.\"\n Roy Mustang (Fullmetal Alchemist)";
						AnimeQuotes[9] = "\"Even if I die, you keep living okay? Live to see the end of this world, and to see why it was born. Live to see why a weak girl like me ended up here… And the reason you and I met.\"\n Sachi (Sword Art Online)";
							
						channel.sendMessage(""+AnimeQuotes[animeQuoteNumber]).queue();
					}
					
				//Help
					if (plainText.equalsIgnoreCase("help")) {
						channel.sendMessage("1. Ping - Gives you ping\n"+
											"2. Fuck you - >:0\n"+
											"3. I love you - :))\n"+
											"4. You are wonderful - :))\n"+
											"5. You are lovely - :))\n"+
											"6. Roll [Number] - Gives you random number you gave it (Default is 6)\n"+
											"7. Wee woo - wee woo\n"+
											"8. Gay - Your mom >:0\n"+
											"9. Cal/Calculate [Number] (+-/x) [Number]- Add or subtract numbers\n"+
											"10. Cal/Calculate A: [Number] B: [Number] C: [Number] - Calculate quadratic\n"+
											"11. Whip - Whips\n"+
											"12. Nae nae - Nae naes\n"+
											"13. Whip nae nae - Whips AND nae naes\n"+
											"14. Give me an anime quote/Anime quote - Gives you an anime quote\n"+
											"15. Sans - Sans undertale B)\n"+
											"16. Bank create - Creates a bank account\n"+
											"17. Bank/Money - Checks account balance\n"+
											"18. Slots [Number] - Play the slot machine with the money you earned\n"+
											"19. Ahegao - Ahegao face\n"+
											"\nYou aquire currency by talking more in chat.").queue();
					}
					
				//	if (plainText.equalsIgnoreCase("test")) {
				//		channel.sendMessage(""+event.getAuthor()).queue();
					
				//	}
				//DEV TOOLs
					if (plainText.equals("devToolUSERID")) {
						System.out.println(""+event.getAuthor().getId());
					
					}
					if (plainText.equals("devToolCARD")) {
						channel.sendMessage(randomCard()).queue();
					
					}

		}
		
	    private void addAmountWhenSpeak(String currentUser) throws IOException {
			Properties properties = new Properties();
			FileReader reader = new FileReader(currentUser);
			properties.load(reader);
			String currency = properties.getProperty("Currency");
			int intCurrency = Integer.valueOf(currency);
			intCurrency ++;
			String newBalance = String.valueOf(intCurrency);
			
			String tempCurrentUserBankAccount = currentUser;
	    	Properties currency1 = new Properties();
			currency1.setProperty("Currency", newBalance);
			FileWriter writer = new FileWriter(tempCurrentUserBankAccount);
			currency1.store(writer, "Bank User");
			writer.close();
			return;
		}
	    
	    private void setIfZero(String currentUser) throws IOException {
			Properties properties = new Properties();
			FileReader reader = new FileReader(currentUser);
			properties.load(reader);
			String currency = properties.getProperty("Currency");
			int intCurrency = Integer.valueOf(currency);
			intCurrency = 0;
			String newBalance = String.valueOf(intCurrency);
			
			String tempCurrentUserBankAccount = currentUser;
	    	Properties currency1 = new Properties();
			currency1.setProperty("Currency", newBalance);
			FileWriter writer = new FileWriter(tempCurrentUserBankAccount);
			currency1.store(writer, "Bank User");
			writer.close();
			return;
		}

		private void slotWinner(String currentUserBankAccount, int moneyPutIn) throws IOException {
			Properties properties = new Properties();
			FileReader reader = new FileReader(currentUserBankAccount);
			properties.load(reader);
			String currency = properties.getProperty("Currency");
			int intCurrency = Integer.valueOf(currency);
			intCurrency += moneyPutIn*moneyPutIn;
			String newBalance = String.valueOf(intCurrency);
			
			String tempCurrentUserBankAccount = currentUserBankAccount;
	    	Properties currency1 = new Properties();
			currency1.setProperty("Currency", newBalance);
			FileWriter writer = new FileWriter(tempCurrentUserBankAccount);
			currency1.store(writer, "Bank User");
			writer.close();
			return;
			
		}

		private void moneyTakeOutOfBank(String currentUserBankAccount, int moneyPutIn) throws IOException{
			Properties properties = new Properties();
			FileReader reader = new FileReader(currentUserBankAccount);
			properties.load(reader);
			String currency = properties.getProperty("Currency");
			int intCurrency = Integer.valueOf(currency);
			intCurrency -= moneyPutIn;
			String newBalance = String.valueOf(intCurrency);
			
			String tempCurrentUserBankAccount = currentUserBankAccount;
	    	Properties currency1 = new Properties();
			currency1.setProperty("Currency", newBalance);
			FileWriter writer = new FileWriter(tempCurrentUserBankAccount);
			currency1.store(writer, "Bank User");
			writer.close();
			return;
		}
		
		private int getCurrentUserMoney(String currentUserBankAccount) throws IOException{
			Properties properties = new Properties();
			FileReader reader = new FileReader(currentUserBankAccount);
			properties.load(reader);
			String currency = properties.getProperty("Currency");
			int intCurrency = Integer.valueOf(currency);
			return intCurrency;
		}

		private void bankCreate(String currentUserBankAccount) throws IOException {
			String tempCurrentUserBankAccount = currentUserBankAccount;
	    	Properties currency = new Properties();
			currency.setProperty("Currency", "100");
			FileWriter writer = new FileWriter(tempCurrentUserBankAccount);
			currency.store(writer, "Bank User");
			writer.close();

			return;
		//	currentUserBankAccount.();

		}
	    
	    private boolean checkFile(String currentUserBankAccount) throws IOException{
			FileReader reader = new FileReader(currentUserBankAccount);
			Properties properties = new Properties();
			properties.load(reader); 
			reader.close();
			return true;
	    }
	    
	    private int checkCurrency(String currentUserBankAccount) throws IOException {
		Properties properties = new Properties();
		FileReader reader = new FileReader(currentUserBankAccount);
		properties.load(reader);
		String currency = properties.getProperty("Currency");
		int intCurrency = Integer.valueOf(currency);
		return intCurrency;
	    }
	    
	    private boolean checkCurrencyNegative(String currentUserBankAccount) throws IOException {
		Properties properties = new Properties();
		FileReader reader = new FileReader(currentUserBankAccount);
		properties.load(reader);
		String currency = properties.getProperty("Currency");
		int intCurrency = Integer.valueOf(currency);
		if (intCurrency > 0)
			return true;
			else return false;
	    }
	    
	    private String randomCard() {
	    	int randomCard = (int)(Math.random()*1)+5;
	    	System.out.print(randomCard);
	    	if (randomCard == 1) {
	    		return "\\_\\_\\_\\_\\_\n"+
	    			   "|2"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|\\_\\_\\_\\_Z|";
	    	}
	    	else if (randomCard == 2) {
	    		return "\\_\\_\\_\\_\\_\n"+
	    			   "|3"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|\\_\\_\\_\\_E|";
	    	}
	    	else if (randomCard == 3) {
	    		return "\\_\\_\\_\\_\\_\n"+
	    			   "|4"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|\\_\\_\\_\\_H|";
	    	}
	    	else if (randomCard == 4) {
	    		return "\\_\\_\\_\\_\\_\n"+
	    			   "|5"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"|\n"+
	    			   "|\\_\\_\\_\\_S|";
	    	}
	    	else if (randomCard == 5) {
	    		return "\\_\\_\\_\\_\\_\n"+
	    			   "|6"+"** ** "+"** ** "+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"|\n"+
	    			   "|"+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"** ** "+"|\n"+
	    			   "|\\_\\_\\_\\_9\\|";
	    	}
	    	return "";
	    }
 }
	

		





 
