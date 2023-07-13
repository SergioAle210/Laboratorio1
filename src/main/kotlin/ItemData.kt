class ItemData(val originalValue: Any?) {

    fun getType(): String? {
        return if (originalValue is String) {
            "cadena"
        } else if (originalValue is Int) {
            "entero"
        } else if (originalValue is Boolean) {
            "booleano"
        } else {
            return null
        }
    }

    fun getInfo(): String? {
        if (originalValue is String) {
            return "L" + (originalValue as String).length
        } else if (originalValue is Int) {
            return if (originalValue as Int % 10 == 0) {
                "M10"
            } else if (originalValue as Int % 5 == 0) {
                "M5"
            } else if (originalValue as Int % 2 == 0) {
                "M2"
            } else {
                null
            }
        } else if (originalValue is Boolean) {
            if (originalValue as Boolean == true) {
                return "Verdadero"
            } else if (!(originalValue as Boolean)) {
                return "Falso"
            }
        } else {
            return null
        }
        return ""
    }
}