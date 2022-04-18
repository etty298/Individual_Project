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
    private static final String TOKEN = "5352710949:AAElM8z9Upq4EyMAjCkAVKkqF3tatmKRvDo";
    private static final String USERNAME = "Project_366_Bot";
    public String state;

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
        if (update.hasMessage() && update.getMessage().hasText()) {
            switch (update.getMessage().getText()) {
                case "/start":
                    sendMessage(update.getMessage(), "Вы можете найти подходящуюю для вас тему проекта");
                    break;
                case "Выбрать тип проекта":
                    sendTypeMessage(update.getMessage(), "Выберите тип проекта");
                    break;
                case "Теоретический":
                    state = "Теоретический";
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Практический":
                    state = "Практический";
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Информатика":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по информатике:\n" +
                                "Киберпреступность и методы борьбы с ней\n" +
                                "Польза и вред компьютерных игр\n" +
                                "Эволюция операционной системы\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по информатике:\n" +
                                "Создание тематического web-сайта\n" +
                                "Создание собственной компьютерной игры\n" +
                                "Распознавание объектов с помощью нейронных сетей\n");
                    }

                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Математика":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по математике:\n" +
                                "Экология глазами математики\n" +
                                "Параболы в арочных мостах\n" +
                                "Вероятность сдачи ОГЭ\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по математике:\n" +
                                "Методы решения уравнений 4 степени\n" +
                                "Различные способы доказательства теоремы Пифагора\n" +
                                "Равносильные преобразования неравенств: теория и практика.\n");
                    }

                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "История":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по истории:\n" +
                                "Духовная жизнь в 20-е годы 20 века\n" +
                                "Геополитическое положение и внешняя политика России\n" +
                                "Политическая система СССР в 30-е годы 20 века\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по истории:\n" +
                                "Перестройка в СССР 1985-1991гг\n" +
                                "Назад в СССР\n" +
                                "Проект реформ П.А. Столыпина\n");
                    }

                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "География":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по географии:\n" +
                                "Антропогенные катастрофы в природе\n" +
                                "Есть ли аномалии тяжелых металлов вдоль автомобильных магистра лей нашего города? Их влияние на наше здоровье\n" +
                                "Древние корни молодого города\n");

                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по географии:\n" +
                                "Жизнь на горячей земле\n" +
                                "Историко-геологическая экскурсия в центре города.\n" +
                                "Воздействие человека на климат\n");

                    }

                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Биология":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по биологии:\n" +
                                "Акустический шум и его воздействие на человека\n" +
                                "Биологический механизм запахов\n" +
                                "Паразитирующие жгутиконосцы\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по биологии:\n" +
                                "Влияние почв на растения\n" +
                                "Модификационная изменчивость бездомного котенка\n" +
                                "Практические аспекты взаимодействия между людьми и птицами\n");
                    }
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Русский язык":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по русскому языку:\n" +
                                "Источник пополнения словарного запаса русского языка\n" +
                                "Источники крылатых слов и выражений\n" +
                                "Штампы и стереотипы в современной публичной речи\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по русскому языку:\n" +
                                "Лексикон учащихся 9-х классов моей школы\n" +
                                "Стилистическое использование профессиональной и терминологической лексики в произведениях художественной литературы\n" +
                                "Слова-паразиты в речи учителей и учащихся\n");
                    }
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Литература":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по литературе:\n" +
                                "Анализ исследование одного стихотворения\n" +
                                "Влияние творчества Дж. Байрона на русскую классическую литературу\n" +
                                "Влияние нецензурной и обсценной лексики на человека\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по литературе:\n" +
                                "Экскурсия по пушкинским местам\n" +
                                "Создание электронного методического пособия по литературе по изучению творчества С.А. Есенина в школе\n" +
                                "Сопоставление поэтических переводов «Слова…»\n");
                    }
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Иностранный язык":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по иностранному языку:\n" +
                                "Глобализация английского языка и его влияние на русский язык\n" +
                                "Исторические связи России и Великобритании\n" +
                                "Начальная школа в Британии\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по иностранному языку:\n" +
                                "-\n" +
                                "-\n" +
                                "-\n");
                    }

                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Физика":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по физике:\n" +
                                "Влияние температуры окружающей среды на изменение снежных узоров на оконном стекле\n" +
                                "Влияние радиоактивности на окружающую среду\n" +
                                "Влияние излучения, исходящего от сотового телефона, на организм человека\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по физике:\n" +
                                "Взвешивание воздуха\n" +
                                "Определение содержания кислорода в воздухе\n" +
                                "Изобретение электрического стула\n");
                    }
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Обществознание":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по оюществознанию:\n" +
                                "История появления Конституции РФ\n" +
                                "Виды наций и межнациональные взаимоотношения\n" +
                                "Значение технического прогресса в жизни общества\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по оюществознанию:\n" +
                                "Участие гражданина в делаx государства\n" +
                                "Создание бизнес плана\n" +
                                "Социальные сети: инструмент для лучшей организации повседневности или средство развлечения?\n");
                    }
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Химия":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по химии:\n" +
                                "Металлы – материал для создания шедевров мирового искусства\n" +
                                "Кислотные осадки: их природа и последствия\n" +
                                "География химических названий\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по химии:\n" +
                                "Анализ проб воды и воздуха в различных частях города\n" +
                                "Гидролиз солей\n" +
                                "Исследование орехов миндаля на содержание цианид-ионов\n");
                    }
                    sendLessonMessage(update.getMessage(), "Выберите подходящий предмет из списка");
                    break;
                case "Физическая культура":
                    if (state.equals("Теоретический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для теоретических проектов по физической культуре:\n" +
                                "Значение ведения самоконтроля при занятиях физическими упражнениями\n" +
                                "Мир спорта моими глазами\n" +
                                "Развитие физических возможностей путем самостоятельной работы\n");
                    } else if (state.equals("Практический")) {
                        sendLessonMessage(update.getMessage(), "Возможные варианты для практических проектов по физической культуре:\n" +
                                "Как самостоятельно построить спортивную площадку\n" +
                                "От чего зависит частота пульса?\n" +
                                "Путь к Олимпу. Мой дневник достижений.\n");
                    }
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
    public void sendTypeMessage (Message message, String text) {
        SendMessage sendMessage = new SendMessage();
        sendMessage.enableMarkdown(true);
        sendMessage.setChatId(message.getChatId().toString());
        sendMessage.setText(text);
        try {
            setTypeButtons(sendMessage);
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
        keyboardFirstRow.add(new KeyboardButton("Выбрать тип проекта"));
        keyboardRowList.add(keyboardFirstRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }
    public void setTypeButtons(SendMessage sendMessage) {
        ReplyKeyboardMarkup replyKeyboardMarkup = new ReplyKeyboardMarkup();
        sendMessage.setReplyMarkup(replyKeyboardMarkup);
        replyKeyboardMarkup.setSelective(true);
        replyKeyboardMarkup.setResizeKeyboard(true);
        replyKeyboardMarkup.setOneTimeKeyboard(false);

        List<KeyboardRow> keyboardRowList = new ArrayList<>();
        KeyboardRow keyboardFirstRow = new KeyboardRow();
        keyboardFirstRow.add(new KeyboardButton("Теоретический"));
        keyboardFirstRow.add(new KeyboardButton("Практический"));
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
        KeyboardRow keyboardFifthRow = new KeyboardRow();
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
        keyboardFifthRow.add(new KeyboardButton("Выбрать тип проекта"));
        keyboardRowList.add(keyboardFirstRow);
        keyboardRowList.add(keyboardSecondRow);
        keyboardRowList.add(keyboardThirdRow);
        keyboardRowList.add(keyboardFourthRow);
        keyboardRowList.add(keyboardFifthRow);
        replyKeyboardMarkup.setKeyboard(keyboardRowList);

    }

}
