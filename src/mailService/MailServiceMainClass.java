package mailService;

import exceptionQuestion.A;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MailServiceMainClass {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public static interface Sendable {
        String getFrom();
        String getTo();
    }

    public static abstract class AbstractSendable implements Sendable {

        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }

    }

    public static class MailMessage extends AbstractSendable {

        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;
            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }

    }

    public static class MailPackage extends AbstractSendable {
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }

    }

    public static class Package {
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    public static interface MailService {
        Sendable processMail(Sendable mail);
    }

    public static class RealMailService implements MailService {

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }

    public static class UntrustworthyMailWorker implements MailService {
        private MailService[] mailServices;
        public UntrustworthyMailWorker(MailService[] mailServices){
            this.mailServices = mailServices;
        }
        @Override
        public Sendable processMail(Sendable mail) {
            Sendable count = mailServices[0].processMail(mail);
            for (int i = 1; i < mailServices.length; i++) {
                count = mailServices[i].processMail(count);
            }
            return getRealMailService().processMail(count);
        }
        public RealMailService getRealMailService() {
            return new RealMailService();
        }
    }

    public static class Spy implements MailService {
        final Logger LOGGER;

        public Spy(Logger logger) {
            LOGGER = logger;
        }
        @Override
        public Sendable processMail(Sendable mail) {
            if (mail instanceof MailMessage) {
                if ((mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo() == AUSTIN_POWERS)) {
                    LOGGER.warning("Detected target mail correspondence: from "
                            + mail.getFrom() + " to" + mail.getTo() + " " + ((MailMessage) mail).getMessage());
                } else {
                    LOGGER.info("Usual correspondence: from " + mail.getFrom() + "to " + mail.getTo());
                }
            }
            return null;
        }
    }

    public static class Thief implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            return null;
        }
    }

    public static class Inspector implements MailService {
        @Override
        public Sendable processMail(Sendable mail) {
            return null;
        }
    }
}
