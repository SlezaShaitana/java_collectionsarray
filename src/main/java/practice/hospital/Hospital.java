package practice.hospital;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {
        final int MAX_TEMP = 40;
        final int MIN_TEMP = 32;
        float pow = (float) Math.pow(10,1);
        float[] patientsTemperatures = new float[patientsCount];
        for (int i = 0; i < patientsTemperatures.length; i ++) {
            double value = Math.random() * ((MAX_TEMP - MIN_TEMP)) + MIN_TEMP;
            double result = Math.ceil(value * pow) / pow;
            patientsTemperatures[i] = (float) result;
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        String tempList = "";
        final float MIN_FOR_HEALTHY = 36.2f;
        final float MAX_FOR_HEALTHY = 36.9f;
        float sum = 0;
        int countHealthyPatients = 0;
        float pow = (float) Math.pow(10,2);

        for (int i = 0; i < temperatureData.length; i ++) {
            if (temperatureData[i] >= MIN_FOR_HEALTHY && temperatureData[i] <= MAX_FOR_HEALTHY){
                countHealthyPatients++;
            }
            sum += temperatureData[i];
            tempList += temperatureData[i] + (i < temperatureData.length -1 ? " " : "");
        }
        float averageTemp = sum / temperatureData.length;
        float formatAverageTemp = Math.round(averageTemp * 100f) / 100f;

        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
            Округлите среднюю температуру с помощью Math.round до 2 знаков после запятой,
            а температуры каждого пациента до 1 знака после запятой
        */
        String report =
            "Температуры пациентов: " + tempList +
            "\nСредняя температура: " + formatAverageTemp +
            "\nКоличество здоровых: " + countHealthyPatients;

        return report;
    }
}
