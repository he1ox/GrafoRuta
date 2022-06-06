package GrafosPkg.Departamentos;

public class Departamento {
    public static final char PETEN = 'a';
    public static final char HUEHUETENANGO = 'b';
    public static final char QUICHE = 'c';
    public static final char ALTA_VERAPAZ = 'd';
    public static final char IZABAL = 'e';
    public static final char BAJA_VERAPAZ = 'f';
    public static final char EL_PROGRESO = 'g';
    public static final char ZACAPA = 'h';
    public static final char SAN_MARCOS = 'i';
    public static final char QUETZALTENANGO = 'j';
    public static final char TOTONICAPAN = 'k';
    public static final char SOLOLA = 'l';
    public static final char CHIMALTENANGO = 'm';
    public static final char SACATEPEQUEZ = 'n';
    public static final char GUATEMALA = 'o';
    public static final char JALAPA = 'p';
    public static final char CHIQUIMULA = 'q';
    public static final char RETALHUEU = 'r';
    public static final char SUCHITEPEQUEZ = 's';
    public static final char ESCUINTLA = 't';
    public static final char SANTA_ROSA = 'u';
    public static final char JUTIAPA = 'v';

    public static String DEPARTAMENTOS = "abcdefghijklmnopqrstuv";

    //Make a function that returns the city name of the given char
    public static String getDepartamento(char id){
        switch (id){
            case PETEN:
                return "Peten";
            case HUEHUETENANGO:
                return "Huehuetenango";
            case QUICHE:
                return "Quiché";
            case ALTA_VERAPAZ:
                return "Alta Verapaz";
            case IZABAL:
                return "Izabal";
            case BAJA_VERAPAZ:
                return "Baja Verapaz";
            case EL_PROGRESO:
                return "El Progreso";
            case ZACAPA:
                return "Zacapa";
            case SAN_MARCOS:
                return "San Marcos";
            case QUETZALTENANGO:
                return "Quetzaltenango";
            case TOTONICAPAN:
                return "Totonicapán";
            case SOLOLA:
                return "Solola";
            case CHIMALTENANGO:
                return "Chimaltenango";
            case SACATEPEQUEZ:
                return "Sacatepequez";
            case GUATEMALA:
                return "Guatemala";
            case JALAPA:
                return "Jalapa";
            case CHIQUIMULA:
                return "Chiquimula";
            case RETALHUEU:
                return "Retalhuleu";
            case SUCHITEPEQUEZ:
                return "Suchitepequez";
            case ESCUINTLA:
                return "Escuintla";
            case SANTA_ROSA:
                return "Santa Rosa";
            case JUTIAPA:
                return "Jutiapa";
            default:
                return "";
        }
    }



}
