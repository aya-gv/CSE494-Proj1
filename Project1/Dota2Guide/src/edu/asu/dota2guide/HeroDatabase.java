package edu.asu.dota2guide;

import java.util.ArrayList;
import java.util.List;

public class HeroDatabase {
	List<Hero> heroes = new ArrayList<Hero>(); //contains all heroes
	List<Hero> strengthheroes = new ArrayList<Hero>(); //contains strength heroes
	List<Hero> agilityheroes = new ArrayList<Hero>(); //contains agility heroes
	List<Hero> intelligenceheroes = new ArrayList<Hero>(); //contains intelligence heroes
	
	HeroDatabase() {
		addBristleback();
		addCentaurWarrunner();
		addDazzle();
		addNaturesProphet();
		addOmniknight();
		addRazor();
		addShadowfiend();
		addSilencer();
		addUndying();
		addWindranger();
		
		//categorize the heroes by type
		for (int i = 0; i < heroes.size(); i++) {
			if (heroes.get(i).getType()=="strength") {
				strengthheroes.add(heroes.get(i));
			}
			else if (heroes.get(i).getType()=="agility") {
				agilityheroes.add(heroes.get(i));
			}
			else if (heroes.get(i).getType()=="intelligence") {
				intelligenceheroes.add(heroes.get(i));
			}
		}
	}
	
	public void addBristleback() {
		Hero hero = new Hero(R.drawable.bristleback, "Bristleback", "strength", "");
		hero.setDescription("In general, Bristleback is a fun character to play. There is " +
				"only really two buttons to press with him, Q and W.\n\nBristleback " + 
				"is not very item dependent, he is a melee hero so early game may be " +
				"the toughest. He will shine in mid and late game though. In early " +
				"game, you want to start off with Viscous Nasal Goo ability. This is " +
				"your only ranged attack. It slows the enemy and does damage at the " +
				"same time. The great thing about Bristleback is that the cooldown for " +
				"all his spells is really fast and has very low mana cost. So you can " +
				"stack the Viscous Nasal Goo attack a lot when laning with someone and " +
				"most likely get a kill. The next ability you should get is Quill Spray " +
				"or Bristleback. Quill spray hits enemy unit close to him and also has " +
				"very low cooldown and low mana cost, so you just want to spam these " +
				"button combinations and get as many kills as you can. His Bristleback " +
				"ability is a passive ability; this lets him act like a \"tank\" " +
				"because he take less damage from the sides or his rear. If he takes " +
				"250 damage in the rear, he automatically releases a Quill Spray " +
				"attack of the current level. So he still attacks when he's trying to " +
				"escape. His ultimate, Warpath is also passive. Everytime he casts a " +
				"spell, he increases his speed and damage. In team fights, Bristleback " +
				"just has to turn his back on the enemy to take in less damage if you " +
				"are the focus, and stack your spells on the enemy.\n\nItems to get\n" +
				"Starting: Tango, Clarity, Branch, stout Shield\nCore: Powertreads, " +
				"Vanguard\nSituational: Crimson guard, Heart of Tarasque\n\nBristleback " +
				"weaknesses\nRanged heroes in early game. If you die a lot in early " +
				"game because you are harassed by ranged heroes, you will be at a " +
				"heavy disadvantage in mid to late game. In mid to late game, he is " +
				"weak against disablers like Earthshaker or Sniper because they can " +
				"stun. So Bristleback has to either rely on team members for disable " +
				"or make an item (like Scythe of Vyse) to have a disable. " +
				"So play it safe, and avoid dying.");
		heroes.add(hero);
	}
	public void addCentaurWarrunner() {
		Hero hero = new Hero(R.drawable.centaurwarrunner, "Centaur Warrunner", "strength", "");
		hero.setDescription("Centaur Warrunner is a great melee strength hero since his role " +
				"is best played in the middle of the battle.\n\nIn early game, no matter " +
				"solo or laning with someone, you want to just play it safe, farm and " +
				"level all your abilities. Your main goal is getting a Blink Dagger " +
				"so you can Blink to an enemy and use your Hoof Stomp ability to stun " +
				"them, then do Double Edge to inflict heavy damage on them. In late game, " +
				"where team fights are most freuqent, you do the same strategy. Also, " +
				"Stampede, his ultimate is very situational. You can use it to help your " +
				"allies escape or you can use it to gank in a very swift and concise " +
				"manner. He is very simple to use which is a plus, but pretty item " +
				"dependent, and here is why: Blink Dagger makes you an initiator (as " +
				"already stated), Blade Mail strengthens your passive ability Return, " +
				"Heart of Tarrasque lets you survive longer in fights, and any other " +
				"item that increases damage is a plus for Centaur Warrunner. It's better " +
				"to get Radiance for a damage item because it also makes your passive " +
				"spell stronger.\n\nItems to get\nStarting: Tango, Stout Shield, Ring of " +
				"Protection, Iron Branch\nCore: Blink Dagger, Trainquil Boots\n" +
				"Situational: Blade Mail, Heart of Tarrasque, Radiance, Mjollnir\n\n" +
				"Centaur Warrunner's Weaknesses\nSilencer would be a horrible match up " +
				"to Centaur Warrunner. Because of Siencer's disabling abilities, he " +
				"can prevent Centaur Warrunner from using Hoof Stampede which is a very " +
				"vital move in a fight to gain the upper hand.");
		heroes.add(hero);
	}
	public void addDazzle() {
		Hero hero = new Hero(R.drawable.dazzle, "Dazzle", "intelligence", "");
		hero.setDescription("In general, Dazzle can be played offensively or as support.\n\n" +
				"Offense\nIn early game, if you are in the mood to kill, go for the Poison " +
				"Touch as the first ability. You can paritally play Dazzle as support " +
				"since Dazzle is not too item dependent. So get the courier and wards in " +
				"early game. The first ability you want to go for is Poison touch. The " +
				"next ability you should get when you level up is Shadow Wave so you can " +
				"heal yourself when one on one with an enemy hero. If you're ahead and " +
				"winning the lane, you can delay getting Shallow Grave, but if you're " +
				"struggling get Shallow Grave so you last longer than the enemy when " +
				"trading attacks. Dazzle is a good ganker because you don't want to be in " +
				"the middle of all the action and be the one to focus on the kill. Be " +
				"sure to gank and win mid game. In late game, team fights occur, by " +
				"this time, you will not be the strongest hero so you will be a " +
				"combination of support and you can kill on the side if the opportunity " +
				"arises. Be sure to heal, and use your Mekansm in team battles, decrease " +
				"the enemy team's armor (and raise your allies' armor with Weave), slow " +
				"and Shallow Grave when needed and you should also be able to win late " +
				"game.\n\nItems to get as offense\nStarting Items: Courier, Observer, " +
				"Tango, Clarity\nCore: Bottle, Bracer, [boots]\nSituational: Mekansm, " +
				"Aghanim's Scepter\n\nSupport\nIn early game, go for Shadow Wave as the " +
				"first ability. You want to be able to heal whoever is laning with you so " +
				"they have the upper hand in health when going head to head with the " +
				"opponent. Another plus is that Shadow Wave deals damage if an enemy unit " +
				"is close to the target you heal. Either Shallow Grave or Poison Touch " +
				"would be the next ability to get. Shallow Grave will prevent the hero from " +
				"dying if casted on ally or on yourself. Poison Touch slows and does dps " +
				"(when the ability is leveled to 4, it stuns enemy for a second). Depending " +
				"on the situation, if you are against an agility hero and you and your " +
				"partner can never make the kill because the enemy runs away, get Poison " +
				"Touch. If you are against a hero who goes head to head and trades blows, " +
				"get Shallow Grave to stay alive longer than your enemy. In mid game, you " +
				"should be accompanying in ganks. Stay hidden in trees or be far in the back " +
				"of the rest of your allies because Dazzle does not have a large amount of " +
				"HP. Because the range of Dazzle's spells are huge, it is okay to stay in the " +
				"back and support. In late game, team fights will occur, and the main " +
				"combination for spells is to use Weave (your ultimate and an AoE) to " +
				"increase armor on your allies and decrease enemy hero armor in the area, " +
				"Poison Touch the closest enemy hero to you, Shadow Wave to attack enemies " +
				"closeby the ally you are healing, and be aware of your allies' life to " +
				"Shallow Grave. If done correctly, you should be able to win every team " +
				"fight.\n\nItems to get as support\nStarting items: Courier, Wards, Tango, " +
				"Mana bottle, and Branches\nCore: Arcane boots\nSituational: Mekansm, " +
				"Aghanim's Scepter\n\nDazzle's Weaknesses\nCharacter's such as Zeus or " +
				"Silencer tend to kill Dazzle easily. Zeus has a global ultimate ability " +
				"where his lightning does heavy damage. If Zeus carries a refresher orb, then " +
				"it is an instant kill for Dazzle. If that happens, you may want to invest in " +
				"Bracers or items that increase your health because you will end up feeding. " +
				"Since Dazzle is very magic dependent for heals or to slow enemy units down, " +
				"Silencer's global silence will make Dazzle very useless. On top of that, if " +
				"Silencer uses Curse of the Silent while Dazzle is silenced, then it is also " +
				"an instant kill for Dazzle because Curse of the Silent does heavy dps when " +
				"leveled up and can't be broken until 20 seconds has elapsed or if a spell is used.");
		heroes.add(hero);
	}
	public void addNaturesProphet() {
		Hero hero = new Hero(R.drawable.naturesprophet, "Nature's Prophet", "intelligence", "");
		hero.setDescription("In general, Nature's Prophet (np) is best played as a pusher.\n\n" +
				"In early game, np's strength is quite high compared to other heroes. So, if " +
				"you have melee characters in your lane, harass them. One of np's weaknesses " +
				"is that he is very item dependent so to play him well, you better have good " +
				"farm throughout the game. You can either be:\n1) off lane, or jungle and " +
				"kill natural creeps to get farm,\n2)lane with someone and focus on killing " +
				"heroes since the gold ouput from last hitting heroes is high. Or,\n3) you " +
				"can choose the hard lane and solo.\n\nIf you choose to jungle in early game, " +
				"get the ability Nature's Call first. You start off with two trees, so get a " +
				"quelling blade as a starting item for more strength against natural creeps " +
				"and kill them off quicker. Keep leveling your Nature's Call ability to farm " +
				"faster. Be wary though because the jungle is the usual place for the enemy " +
				"to gank lanes, so invest in wards as well to avoid being killed. If you " +
				"farm enough gold, get the Hand of Midas and use it on the biggest creep you " +
				"can find when jungling. Hand of Midas gives you bonus experience against a " +
				"creep and bonus gold output, so farming will be a lot easier. Aim to get " +
				"your core items and a Shadow Blade. By mid game, you should have enough " +
				"gold to get a Shadow Blade and so, you can start fending off by yourself to " +
				"push towers; Shadow Blade gives you an escape when an enemy teleports to " +
				"their tower to try and defend. In late game, you can possibly help in team " +
				"fights by using Sprout and being in the background. If you're in a different " +
				"lane, be aware of where the team fight is and use your ultimate, Nature's " +
				"Wrath to globally hit enemies that need one more hit to get the kill; " +
				"sometimes the enemy is trying to get back but when you use this ability it " +
				"is pretty much gg for that team fight.\n\nIf you choose to lane with " +
				"someone in early game, you may want to get the ability Sprout. The main " +
				"strategy is to Sprout the enemy so they can't move and you gain up on them " +
				"with your ally. If done correctly, you should always be able to get a kill. " +
				"Make sure whoever you are laning with is not an item dependent character " +
				"because if you are both item dependent then you have to share farm, and in " +
				"this case you're being greedy by taking all the farm. Therefore, you have " +
				"to make your decisions carefully. Mid game and late game is always the same, " +
				"once you get your items you should be able to push lanes by yourself or with " +
				"your team respectively.\n\nIf you choose the hard lane to solo, you want " +
				"Sprout or Teleportation as a first ability. For Sprout, its the same " +
				"technique as it would be if you're laning with someone except you're by " +
				"yourself. In this case, exchange blows until the enemy hero starts " +
				"retreating, then use Sprout to prevent them to escapse and finish them off. " +
				"If you get Teleportation first, you can level it up faster and the cooldown " +
				"as it reaches max level decreases to 20 seconds. This ability helps you gank " +
				"other lanes and get kills that way too. Since you have soloed a lane, you " +
				"don't share experience with anyone so you should be a high level quicker. " +
				"Mid-game and late game is still the same, it all depends on how you farm.\n\n" +
				"*Tip: use teleportation to get the bounty runes every 2 min. It gives you " +
				"bonus experience and bonus gold.\n\nItems to get\nStarting: Tango, Clarity, " +
				"Iron Branch, Ring of Protection\nCore: Power Treads, Magic Wand, Scythe of " +
				"vyse\nSituational: Hand of Midas, Desolator, Mekansm, Aghanim's Scepter, " +
				"Necronomicron\n\nNp's weaknesses\nStrength characters in early game can be a " +
				"bit of trouble if np is stronger than your ally. Or it can be a bit of " +
				"trouble when soloing a lane. Bloodseeker can be very annoying to be up " +
				"against because even if you Shadow Blade and your life is 35%, then " +
				"Bloodseeker countered your escape method for solo pushing. Rather, anyone " +
				"with a gem of true sight or dust. Your goal is not to die and not lose your " +
				"farm, so you have to play really safe with np.");
		heroes.add(hero);
	}
	public void addOmniknight() {
		Hero hero = new Hero(R.drawable.omniknight, "Omniknight", "strength", "");
		hero.setDescription("Depending on what kind of role you are comfortable with, " +
				"Omniknight is generally a support or semi-carry kind of hero.\n\n" +
				"In early game, since you are a strength hero, you are generally " +
				"pretty strong, and to top it off you can heal which gives you an " +
				"advantage in early fights. You want to invest in a Soul Ring early " +
				"game for your mana. With Omniknight, you never want to run out of " +
				"mana because he is very spell dependent in fights. You want to get " +
				"Purification as your first ability if you are laning with someone to " +
				"heal them or even when laning by yourself so you can heal yourself " +
				"and win early fights. You can deal damage with Purification so be " +
				"sure to use it to deal a lot of damage in early game. The next " +
				"ability you want to get is either Repel or Degen Aura depending on " +
				"the heroes you are up against. Repel grants spell immunity and 100% " +
				"resistance to magic damage and Degen Aura (tip: the slow stacks so " +
				"get Shiva's Guard if you can) degenerates movement and attack " +
				"capabilities of enemy units that stray too near (also include spell " +
				"immune enemies). So if you're up against someone who uses a lot of " +
				"magic for damage, get Repel (also note that Repel can be used on " +
				"enemies). If you need a slow, get Degen Aura. By mid game you should " +
				"have all your abilities, and your ultimate, Guardian Angel (tip: " +
				"Aghanim's Scepter upgrades this ability), which grants immunity from " +
				"physical damage. It's time to start ganking so be sure to have a " +
				"carry with you and initiate by using Repel on him, deal damage with " +
				"Purification and Degen Aura the enemy if they try to escape the " +
				"kill. In late game, the team fights occur, and luckily its a very " +
				"simple concept. Initiate by using Repel on the carry in your team " +
				"and use your ultimate to have a huge advantage for every team " +
				"fight.\n\nItems to get\nStarting: Tango, Clarity, Iron Branch, Ring " +
				"of Protection\nCore: Arcane boots, Soul Ring\nSituational: Aghanim's " +
				"scepter, Mekansm, Sange and Yasha, Heart of Tarrasque, Refresher Orb\n\n" +
				"Omniknight weaknesses\nOmniknight is weak against Skywrath Mage mainly " +
				"because he can slow and has an ability that seals the targeted unit with " +
				"an ancient rune, silencing it and causing it to take additional damage " +
				"from spells. Shadow Demon is also a weakness because of his Purge ability " +
				"which inolves removing positive buffs, and slowing the target for the duration.");
		heroes.add(hero);
	}
	public void addRazor() {
		Hero hero = new Hero(R.drawable.razor, "Razor", "agility", "");
		hero.setDescription("Razor is a ranged, agility carry.\n\n" +
				"In early game, Razor can lane with someone or solo a lane. It is " +
				"not recommended to solo the hard lane though because Razor " +
				"cannot escape well early game. Just focus on last hitting and " +
				"denying to farm well. Get your Plasma Field first to harrass the " +
				"lane because it releases a wave of electricity that increases " +
				"damage with distance from you. And then get Instable Current to " +
				"move faster and to damage/slow/purge buffs from enemies when an " +
				"ability targets him. Then get Static link and go for kills " +
				"because you can steal damaage from enemy heroes with that " +
				"ability. By mid game, you should have Eye of the Storm, your " +
				"ultimate ability, which deals a lot of damage and reduces armor " +
				"on enemy units. If you get Aghanim's Scepter, this ability can " +
				"work on towers, barracks and Ancient. Start participating in " +
				"pushes and ganks to gain money this way instead of farming " +
				"like hard carries do. Just remember to Static Link, and go in " +
				"for the kills. By late game, you need to be farmed well to be " +
				"very effective. Pick your situational items carefully. Team " +
				"fights are genereally the same, just don't forget to Static " +
				"Link.\n\nItems to get\nStarting: Tango, Clarity, Iron Branch\n" +
				"Core: Power Treads, Magic Wand, Blade Mail\nSituational: Sange " +
				"and Yasha, Aghanim's Scepter, Heart of Tarrasque, Butteryfly\n\n" +
				"Razor's weaknesses\nRazor is weak against long range characters " +
				"such as Sniper and stunners such as Earth Shaker.");
		heroes.add(hero);
	}
	public void addShadowfiend() {
		Hero hero = new Hero(R.drawable.shadowfiend, "Shadowfiend", "agility", "");
		hero.setDescription("Shadowfiend is a ranged agility hero.\n\n In " +
				"early game, Shadowfiend usually lanes mid because he should " +
				"really get to level 6 as soon as possible. Once he gets his " +
				"level 6 ability he is a very good ganker. Requiem of Souls, his " +
				"ultimate, deals a large amount of damage and at the same time " +
				"slows+reduces the attack damage of nearby enemies. You want to " +
				"get Necromastery first because it steals souls from units he " +
				"kills which gives him bonus damage. If you kill a hero you gain " +
				"12 souls and when you die you lose half of those souls. The next " +
				"skill you want is Shadowraze which deals a lot of damage to " +
				"enemy units in an area (near, medium or far). You can support in " +
				"team fights by reducing armor of nearby enemies when you get " +
				"Presence of the Dark Lord. You might want to play it safe in " +
				"early game and never rely on your physical attacks because you " +
				"deal close to no damage. By mid game, you want to have a Blink " +
				"Dagger because Shadowfiend is quite squishy, it will be your " +
				"escape. Be sure to get your runes every two minutes and follow " +
				"the item build. If you get surrounded in the river, you will die " +
				"without your BKB and Blink Dagger. In late game, you need to " +
				"find a balance to farm and gank to be a successful Shadowfiend " +
				"player. You win most fights by ganking instead of a head on " +
				"charge for a team fight.\n\nItems to get\nStarting: Tango, " +
				"Clarity, Slippers of Agility, Iron Branch\nCore: Bottle, Blink " +
				"Dagger, Power Treads\nSituational: BKB, Heart of Tarrasque, " +
				"Butterfly, Desolator\n\nShadowfiend weakness\nShadowfiend is " +
				"very spell dependent because he deals absolutely close to no " +
				"damage with his physical attack so any hero that can silence or " +
				"Silencer himself would be a huge weakness on Shadowfiend.");
		heroes.add(hero);
	}
	public void addSilencer() {
		Hero hero = new Hero(R.drawable.silencer, "Silencer", "intelligence", "");
		hero.setDescription("In general, Silencer is a pretty balanced character who " +
				"helps supports by disabling but a heavy hitter as well\n\n In early " +
				"game, if you are laning with someone, you may want to get Silence " +
				"as your first ability. This allows you to disable heavy hitting " +
				"spells or counter another disabler before they can disable you or " +
				"your ally and you can harass the enemy since you're ranged. The " +
				"second ability you should get is Curse of the Silent. This ability " +
				"does dps unless the enemy uses a spell or waits until the time of " +
				"Curse of the Silent elapses. Thus, if you Silence then use Curse of " +
				"the Silent the enemy is forced to wait until the curse is lifted " +
				"and lots of damage has already occurred (on top of that you can use " +
				"your physical attack while they are being cursed and its pretty " +
				"much a guaranteed kill every time). However, if you choose to solo " +
				"a lane, you may want to get Glaives of Wisdom first, you can steal " +
				"intelligene and you give additional pure damage based on his " +
				"Intelligence. It has a really low mana cost of 15. So you will " +
				"definitely hit a lot more than whoever is in your lane. Being " +
				"ranged, you can get to your tower quicker and not take any damage " +
				"at all if played correctly.\n\nBy mid-game, you should have your " +
				"core items and start participating in ganks. In late game, you " +
				"shine because you have an ultimate called Global Silence (Tip: " +
				"Global silence is upgraded by Aghanim's scepter). This silences " +
				"everyone on the map, so it is a very good initiator for team " +
				"fights. If you couple Global Silence and Curse of the Silent " +
				"while the whole enemy team is clumped together, your team would " +
				"have the upper hand in the team fight. The downfall is that " +
				"Global Silence has a very long cooldown. Silencer is all about " +
				"timing, so if you waste your moves with him, you pretty much " +
				"lose the game.\n\nItems to get\nStarting items: Tango, Clarity, " +
				"Circlet, Mantle of Intelligence\nCore: Power treads, Bottle, " +
				"Null Talisman\nSituational: Mekansm, Aghanim's scepter\n\n" +
				"Silencer's Weaknesses\nSilencer is not good up against heroes " +
				"with low cooldown spells like Bristleback. They will be able to " +
				"break Curse of the Silent really fast and so it is pretty much " +
				"ineffective. Heroes who are not very dependent on spells like " +
				"Huskar (he does a lot of physical damage and does not really use " +
				"spells to do a lot) is not a good matchup for Silencer either. So " +
				"watch out for those heroes.");
		heroes.add(hero);
	}
	public void addUndying() {
		Hero hero = new Hero(R.drawable.undying, "Undying", "strength", "");
		hero.setDescription("Undying takes the role as a tanky, spell casting, melee strength " +
				"hero.\n\nUndying is a pretty balanced character. You can heal your allies or " +
				"deal damage to enemy targets with Soul Rip, and yet you can be played as a " +
				"killer by your ability to steal strength with Decay. If you choose to solo a " +
				"lane, you should max out Decay as fast as you can. Then get Tombstone and " +
				"level Soul Rip. Tombstone when leveled, will have a ton of zombies that " +
				"spawn to every enemy unit in the area. The zombies spawn next to every " +
				"enemy unit in the area around the tombstone and attacks them. The zombies " +
				"that spawn slows their target and if their target falls below a certain " +
				"amount of health, it increases th attack and movement speed of the spawned " +
				"zombie. When laning with someone balance our your ability levels and use " +
				"Decay to harass the lane and get as many kills as you can (and don't forget " +
				"to heal the ally you are laning with).In mid-game, you should have all your " +
				"abilities that are decently leveled and start ganking. The main strategy is " +
				"to stay hidden behind trees, plant your Tombstone, Decay the area, Flesh " +
				"Golem and Soul Rip. Flesh Golem is your ultimate and you basically turn " +
				"into this fat zombie that slows all the enemy units in a 750 range from you " +
				"an amplifies the damage taken when they are closer to you. When an enemy " +
				"unit dies around you, you are healed with an equal percentage of your own " +
				"max health (tip: upgradable by Aghanim's Scepter). Soul Rip is very " +
				"situational, if your team is fine on HP then use it to hurt someone, if " +
				"you're struggling to win the fight use it to heal your allies. In late game, " +
				"your team fights will have a similar strategy. Initiate with either your " +
				"ultimate or Tombstone (if you're already in the middle of everything just " +
				"go straight to Flesh Golem and then Tombstone). Then use Decay as much as you " +
				"can and kill everything in your path.\n\nItems to get\nStarting items: Tango, " +
				"Clarity, Stout Shield, Iron Branch\nCore Items: Arcane Boots, Vanguard, Ring " +
				"of Basilius\nSituational Items: Aghanim's SCepter, Crimson Guard, Heart of " +
				"Tarrasque\n\nUndying's Weaknesses\nUndying is very mana dependent and can lose " +
				"mana rather quickly. He is only really strong when he steals strength, so " +
				"Silencer or anyone that can silence makes Undying pretty useless until he " +
				"the time of Silence is elapsed.");
		heroes.add(hero);
	}
	public void addWindranger() {
		Hero hero = new Hero(R.drawable.windranger, "Windranger", "intelligence", "");
		hero.setDescription("In general, Windranger (wr) is an Intelligence character, but " +
				"acts like an agility character because of her skillset.\n\nIn early game, " +
				"if you're laning by yourself, it is best to get Windrun ability first. " +
				"It's your best escape if you're getting ganked early because it increases " +
				"your movement and evasion from physical attacks as well as slowing nearby " +
				"enemies. You should max our your levels for Powershot as soon as you " +
				"possibly can because this is your nuke attack. Try not to cancel the attack " +
				"because if you cancel the channeling spell, it does not deal as much damage " +
				"as it could have. To always get your Powershot to land, you want to use " +
				"Shackleshot to stun the enemy (if the enemy is by a tree, you can shackle " +
				"him to the tree and have a longer stun duration). Her ultimate, Focus Fire " +
				"(also upgradable by Aghanim's scepter), not only bombards her opponent with " +
				"a ton of arrows but can also be used on towers; so she can be a fairly good " +
				"pusher as well. By mid game and late game you will be a very strong ganker. " +
				"Hide in the trees and use Powershot and a lot of the opponent's life in the " +
				"given area will be taken out. Shackleshot and use your ultimate on a target, " +
				"it will be an instant kill usually, and then you can use your Windrun to " +
				"charge in for the next kill. You should pretty much win every team fight if " +
				"you use her abilities correctly. Mekansm is also strong on Windranger, so " +
				"invest in a Mekansm as early as you can.\n\nItems to get\nStarting: Tango, " +
				"Clarity, Mantle of Intelligence, Iron Branch\nCore items: Phase boots, " +
				"Force Staff\nSituational: Mekansm, Aghanim's Scepter, Monkey King Bar\n\n" +
				"Windranger weaknesses\nwr is weak against Templar Assassin mainly because of " +
				"her ability Refraction which has a limited number of instantces that makes " +
				"her elusive; it prevents projectile from getting  bonus damage, but it will " +
				"use up one instance upon landing. Silencer is also a weakness of wr because " +
				"she is an intelligence heroes and her nuke attacks rely on her spells, so his " +
				"Global Silence could crucify her.");
		heroes.add(hero);
	}
}
