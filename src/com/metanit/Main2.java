package com.metanit;

public class Main2 {

    public static void main(String[] args) {
        int role = 1;
        // 1 - user
        // 2 - admin
        // 3 - owner
        // 4 - undefined
        switch (role) {
            case 1:
                System.out.println("Вы вошли в систему как пользователь");
                break;
            case 2:
                System.out.println("Вы вошли в систему как администратор");
                break;
            case 3:
                System.out.println("Вы вошли в состему как владелец");
                break;
            case 4:
                System.out.println("Вы вошли в состему как неопределенное лицо");
                break;

        }
    }
}
