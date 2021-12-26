package chap7.Abstract;

class SmartPhone extends Phone {  //실체클래스

    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("인터넷 검색을 합니다.");
    }
}
