package DM.Organizer;

public class Stats {

	private int iSTR;

	private int iDEX;

	private int iCON;

	private int iINT;

	private int iWIS;

	private int iCHA;

	private int iProficiency;

	// 1
	private int iAthletics;

	private Boolean bAthletics;

	// 2
	private int iAcrobatics;

	private Boolean bAcrobatics;

	// 3
	private int iSleight;

	private Boolean bSleight;

	// 4
	private int iStealth;

	private Boolean bStealth;

	// 5
	private int iArcana;

	private Boolean bArcana;

	// 6
	private int iHistory;

	private Boolean bHistory;

	// 7
	private int iInvestigation;

	private Boolean bInvestigation;

	// 8
	private int iNature;

	private Boolean bNature;

	// 9
	private int iReligion;

	private Boolean bReligion;

	// 10
	private int iAnimal;

	private Boolean bAnimal;

	// 11
	private int iInsight;

	private Boolean bInsight;

	// 12
	private int iMedicine;

	private Boolean bMedicine;

	// 13
	private int iPerception;

	private Boolean bPerception;

	// 14
	private int iSurvival;

	private Boolean bSurvival;

	// 15
	private int iDeception;

	private Boolean bDeception;

	// 16
	private int iIntimidation;

	private Boolean bIntimidation;

	// 17
	private int iPerformance;

	private Boolean bPerformance;

	// 18
	private int iPersuasion;

	private Boolean bPersuasion;

	public Stats(int _iSTR, int _iDEX, int _iCON, int _iINT, int _iWIS, int _iCHA, int _iProficiency) {
		iSTR = _iSTR;
		iDEX = _iDEX;
		iCON = _iCON;
		iINT = _iINT;
		iWIS = _iWIS;
		iCHA = _iCHA;
		iProficiency = _iProficiency;

		setUpAbilities();
	}

	private void setUpAbilities() {

		iAthletics = getAbilityMod("STR");
		iAcrobatics = iSleight = iStealth = getAbilityMod("DEX");
		iArcana = iHistory = iInvestigation = iNature = iReligion = getAbilityMod("INT");
		iAnimal = iInsight = iMedicine = iPerception = iSurvival = getAbilityMod("WIS");
		iDeception = iIntimidation = iPerformance = iPersuasion = getAbilityMod("CHA");

		bAthletics = bAcrobatics = bSleight = bStealth = bArcana = bHistory = bInvestigation = bNature = bReligion = bAnimal = bInsight = bMedicine = bPerception = bSurvival = bDeception = bIntimidation = bPerformance = bPersuasion = false;
	}

	public int getAbilityMod(String _sAbilityName) {

		int iAbilityScore = 0;
		switch (_sAbilityName) {
		case "STR":
			iAbilityScore = iSTR;
			break;
		case "DEX":
			iAbilityScore = iDEX;
			break;
		case "CON":
			iAbilityScore = iCON;
			break;
		case "INT":
			iAbilityScore = iINT;
			break;
		case "WIS":
			iAbilityScore = iWIS;
			break;
		case "CHA":
			iAbilityScore = iCHA;
			break;
		}
		return ((iAbilityScore - 10) / 2);
	}

	public void addProficiency(int _iAbilityNumber) {
		switch (_iAbilityNumber) {
		case 1:
			if (!bAthletics) {
				bAthletics = true;
				iAthletics += iProficiency;
			}
			break;
		case 2:
			if (!bAcrobatics) {
				bAcrobatics = true;
				iAcrobatics += iProficiency;
			}
			break;
		}
		
	}
}
