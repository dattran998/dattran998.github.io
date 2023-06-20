package logichandle;

import entity.PaperType;

import java.util.Scanner;

public class PaperTypeLogicManagement {
    private PaperType[] paperTypes = new PaperType[100];

    public PaperType[] getPaperTypes() {
        return paperTypes;
    }

    public boolean paperTypeIsNotEmpty() {
        for (int i = 0; i < paperTypes.length; i++) {
            if (paperTypes[i] != null)
                return true;
        }
        return false;
    }



    public void showPaperType() {
        for (int i = 0; i < paperTypes.length; i++) {
            if (paperTypes[i] != null)
                System.out.println(paperTypes[i]);
        }
    }

    public void inputNewPaperType() {
        System.out.println("Bạn muốn thêm bao nhiêu kiểu bài viết: ");
        int paperTypeNumber = new Scanner(System.in).nextInt();

        for (int i = 0; i < paperTypeNumber; i++) {
            System.out.println("Nhập thông tin kiểu bài viết thứ " + (i + 1) + ":");
            PaperType paperType = new PaperType();
            paperType.inputInfo();
            savePaper(paperType);
        }

    }

    public void savePaper(PaperType paperType) {
        for (int i = 0; i < paperTypes.length; i++) {
            if (paperTypes[i] == null) {
                paperTypes[i] = paperType;
                break;
            }
        }
    }

}
