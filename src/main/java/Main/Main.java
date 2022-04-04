package Main;

import org.telegram.telegrambots.ApiContextInitializer;
import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.meta.ApiContext;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiRequestException;

public class Main {
    public static void main(String[] args) {
        ApiContextInitializer.init();
        DefaultBotOptions defaultBotOptions = ApiContext.getInstance(DefaultBotOptions.class);

        //defaultBotOptions.setProxyType(DefaultBotOptions.ProxyType.SOCKS5);
        //defaultBotOptions.setProxyHost("localhost");
        //defaultBotOptions.setProxyPort(9150);

        Project project = new Project(defaultBotOptions);
        TelegramBotsApi telegramBotsApi = new TelegramBotsApi();

        try {
            telegramBotsApi.registerBot(project);
        } catch (TelegramApiRequestException e) {
            e.printStackTrace();
        }
    }
}
