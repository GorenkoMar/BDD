package ru.netology.javaqa.page;

import ru.netology.javaqa.data.DataHelper;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    public static VerificationPage validLogin(DataHelper.AuthInfo info) {
        $("[data-test-id=login] input").setValue(info.getLogin());
        $("[data-test-id=password] input").setValue(info.getPassword());
        $("[data-test-id=action-login]").click();
        return new VerificationPage();

    }
}