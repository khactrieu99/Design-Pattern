package structural.facade;

/**
 * @author trieutk
 */
public class ShopFacade {
    private static final ShopFacade INSTANCE = new ShopFacade();

    private AccountService accountService;
    private PaymentService paymentService;
    private EmailService emailService;
    private SmsService smsService;

    private ShopFacade() {
        accountService = new AccountService();
        paymentService = new PaymentService();
        emailService = new EmailService();
        smsService = new SmsService();
    }

    public static ShopFacade getInstance() {
        return INSTANCE;
    }

    public void buyProductByPaypal(String email) {
        accountService.getAccount(email);
        paymentService.paymentWithPaypal();
        emailService.sendMail();
        smsService.sendSMS();
    }

    public void buyProductByCreditCard(String email) {
        accountService.getAccount(email);
        paymentService.paymentWithCreditCard();
        emailService.sendMail();
        smsService.sendSMS();
    }
}
