package DM.Organizer;

public class Character {

	private String sName;

	private String sNickName;

	private String oClass;

	private int iLevel;

	private String sPlayerName;

	private String oRace;

	private String sAlignment;

	private int iExp;

	private Armor oArmor;

	private int iAC;

	private int iInitiative;

	private int iSpeed;

	private int iCurrentHP;

	private int iTempHP;

	private int iMaxHP;

	private Boolean bInspiration;

	private Stats oStats;

	private Weapon oWeapon;

	private Money oMoney;

	private int iAge;

	private int iWeight;

	private int iHeight;

	private String sEyes;

	private String sSkin;

	private String sHair;

	public Character(String _sName, String _sNickName, String _oClass, String _sPlayerName, String _oRace,
			String _sAlignment, Armor _oArmor, int _iMaxHP, Stats _oStats, Weapon _oWeapon, Money _oMoney, int _iAge,
			int _iWeight, int _iHeight, String _sEyes, String _sSkin, String _sHair) {


		iLevel = 1;
		iExp = 0;
		iAC = 0;
		iTempHP = 0;
		iInitiative = 0;
		iSpeed = 0;
		bInspiration = false;
		sName = _sName;
		sNickName = _sNickName;
		oClass = _oClass;
		sPlayerName = _sPlayerName;
		oRace = _oRace;
		sAlignment = _sAlignment;
		oArmor = _oArmor;
		iCurrentHP = _iMaxHP;
		iMaxHP = _iMaxHP;
		oStats = _oStats;
		oWeapon = _oWeapon;
		oMoney = _oMoney;
		iAge = _iAge;
		iWeight = _iWeight;
		iHeight = _iHeight;
		sEyes = _sEyes;
		sSkin = _sSkin;
		sHair = _sHair;
		
	}

	private int calculateAC() {
		// TODO Auto-generated method stub
		return 0;
	}
}
