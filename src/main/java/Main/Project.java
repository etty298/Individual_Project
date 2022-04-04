package Main;


import org.telegram.telegrambots.bots.DefaultBotOptions;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.ReplyKeyboardMarkup;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardButton;
import org.telegram.telegrambots.meta.api.objects.replykeyboard.buttons.KeyboardRow;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

import java.util.ArrayList;
import java.util.List;

public class Project extends TelegramLongPollingBot {
    private static final String TOKEN = "2119234226:AAGVgb47K_S4OANvpI3rZPpF0LFoVCtosyw";
    private static final String USERNAME = "Project_366_Bot";

    public Project(DefaultBotOptions options) {
        super(options);
    }
    @Override
    public String getBotUsername() {
        return USERNAME;
    }

    @Override
    public String getBotToken() {
        return TOKEN;
    }

    @Override
    public void onUpdateReceived(Update update) {
        if (update.getMessage() != null && update.getMessage().hasText()) {
            switch (update.getMessage().getText()) {
                case "/start":
                    sendMessage(update.getMessage(), "Вы можете найти подходящуюю для вас тему проекта");
                    break;
                case "Выбрать предмет":
                sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                break;
                case "Информатика":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по информатике:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Математика":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по математике:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "История":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по истории:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "География":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по географии:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Биология":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по биологии:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Русский язык":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по русскому языку:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Литература":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по литературе:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Иностранный язык":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по иностранному языку:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Физика":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по физике:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Обществознание":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по оюществознанию:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Химия":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по химии:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Физическая культура":
                    sendLessonMessage(update.getMessage(), "Возможные варианты для проектов по физической культуре:\n" +
                            "-\n" +
                            "-\n" +
                            "-\n");
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                default:
            }
        }
    }
    public void sendLessonMessage (Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            setLessonsButtons(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    public void sendMessage (Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            setButtons(sendMessage);
            execute(sendMessage);
        } catch (TelegramApiException e) {
            e.printStackTrace();
        }
    }
    public void setButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(new KeyboardButton("Выбрать предмет"));
        keyboardRowList.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }
    public void setLessonsButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        KeyboardRow keyboardSecondRow = new KeyboardRow();
        KeyboardRow keyboardThirdRow = new KeyboardRow();
        KeyboardRow keyboardFourthRow = new KeyboardRow();
        keyboardFirstRow.add(new KeyboardButton("Информатика"));
        keyboardFirstRow.add(new KeyboardButton("Математика"));
        keyboardFirstRow.add(new KeyboardButton("История"));
        keyboardSecondRow.add(new KeyboardButton("География"));
        keyboardSecondRow.add(new KeyboardButton("Биология"));
        keyboardSecondRow.add(new KeyboardButton("Русский язык"));
        keyboardThirdRow.add(new KeyboardButton("Литература"));
        keyboardThirdRow.add(new KeyboardButton("Иностранный язык"));
        keyboardThirdRow.add(new KeyboardButton("Физика"));
        keyboardFourthRow.add(new KeyboardButton("Обществознание"));
        keyboardFourthRow.add(new KeyboardButton("Химия"));
        keyboardFourthRow.add(new KeyboardButton("Физическая культура"));
        keyboardRowList.add(keyboardFirstRow);
        keyboardRowList.add(keyboardSecondRow);
        keyboardRowList.add(keyboardThirdRow);
        keyboardRowList.add(keyboardFourthRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

}
