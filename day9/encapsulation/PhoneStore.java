package day9.encapsulation;

public class PhoneStore {

    private Phone phone;

    public PhoneStore(Phone phone) {
        this.phone = phone;
    }


    /**
     * 대리점이 휴대폰을 파는 동작/매서드
     * - 요금제를 등록하고(registerPayment), 할인을 적용 한 뒤(discountPromotion), 휴대폰을 전달함(return)
     * todo : 모델명과 예산을 파라메터로 받아서 구입가능여부를 확인 후 반환값을 전달
     *
     * @param model, budget
     * @return Phone 판매한 휴대폰 객체
     */
    public Phone sellPhone(String model, double budget) {
        //대리점이 휴대폰을 판매 할 때 일어나는 일

        if ((model.equals(phone.getModel())) && (phone.getPrice() <= budget)) {
            System.out.println(phone.getModel() + "을 구매할 예산이 충분합니다.");
            registerPayment();
            discountPromotion();
            System.out.println("대리점 : 휴대폰 전달");
            //return 구문이 휴대폰을 전달하는 실제 과정
            return phone;
        } else {
            System.out.println(phone.getModel() + "을 구매할 예산이 부족합니다.");
            return null;
        }

    }


    private void registerPayment() {
        System.out.println("대리점 : 요금제를 등록합니다. 약정을 등록합니다.");
    } //대리점 안에서만 일어나야 하므로 private

    private void discountPromotion() {
        System.out.println("대리점 : 이벤트로 할인이 적용됩니다.");
    }


}
