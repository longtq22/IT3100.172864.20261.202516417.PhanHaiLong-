package giaodien;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class GiaoDienMenuOAnQuan extends JFrame {
	private static final long serialVersionUID = 1L;
	private static final Color MAU_NEN_XANH_REU = new Color(24, 46, 34);       
    private static final Color MAU_VANG_KIM = new Color(228, 184, 88);          
    private static final Color MAU_CHU_TRANG_KEM = new Color(245, 242, 232);    
    private static final Color MAU_NUT_XANH = new Color(38, 74, 54);            
    private static final Color MAU_NUT_THOAT = new Color(139, 44, 44);          

    public GiaoDienMenuOAnQuan() {
        setTitle("Trò chơi Dân gian: Ô Ăn Quan Online");
        setSize(900, 550);
        setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE); 
        setLocationRelativeTo(null); 

        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(java.awt.event.WindowEvent e) {
                xacNhanThoatUngDung();
            }
        });

        JPanel panelChinh = new JPanel();
        panelChinh.setBackground(MAU_NEN_XANH_REU);
        panelChinh.setLayout(new BorderLayout());
        panelChinh.setBorder(new EmptyBorder(40, 50, 40, 50));

        panelChinh.add(taoPanelTieuDe(), BorderLayout.NORTH);

        panelChinh.add(taoPanelNutBam(), BorderLayout.CENTER);

        JLabel lblFooter = new JLabel("❖ Không cần cài đặt · Chơi 2 người chế độ PvP trực tiếp ❖", SwingConstants.CENTER);
        lblFooter.setFont(new Font("SansSerif", Font.ITALIC, 13));
        lblFooter.setForeground(new Color(170, 190, 175));
        panelChinh.add(lblFooter, BorderLayout.SOUTH);

        add(panelChinh);
    }


    private JPanel taoPanelTieuDe() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel lblSub = new JLabel("◆ DI SẢN TRÒ CHƠI DÂN GIAN VIỆT NAM ◆");
        lblSub.setFont(new Font("Serif", Font.BOLD, 14));
        lblSub.setForeground(MAU_VANG_KIM);
        lblSub.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblTitle = new JLabel("Ô Ăn Quan");
        lblTitle.setFont(new Font("Serif", Font.BOLD, 54));
        lblTitle.setForeground(MAU_CHU_TRANG_KEM);
        lblTitle.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblOnline = new JLabel("O N L I N E");
        lblOnline.setFont(new Font("SansSerif", Font.BOLD, 22));
        lblOnline.setForeground(MAU_VANG_KIM);
        lblOnline.setAlignmentX(Component.CENTER_ALIGNMENT);

        JLabel lblDesc = new JLabel("Trải nghiệm trò chơi trí tuệ Ô ăn quan truyền thống với giao diện hiện đại.");
        lblDesc.setFont(new Font("SansSerif", Font.PLAIN, 14));
        lblDesc.setForeground(MAU_CHU_TRANG_KEM);
        lblDesc.setAlignmentX(Component.CENTER_ALIGNMENT);

        panel.add(lblSub);
        panel.add(Box.createRigidArea(new Dimension(0, 10)));
        panel.add(lblTitle);
        panel.add(lblOnline);
        panel.add(Box.createRigidArea(new Dimension(0, 15)));
        panel.add(lblDesc);

        return panel;
    }

    private JPanel taoPanelNutBam() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 25, 30));

        JButton btnStart = taoNutCustom("  Chơi ngay  >", MAU_VANG_KIM, MAU_NEN_XANH_REU);
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                batDauGame();
            }
        });

        JButton btnHelp = taoNutCustom("Xem hướng dẫn >", MAU_NUT_XANH, MAU_CHU_TRANG_KEM);
        btnHelp.setBorder(BorderFactory.createCompoundBorder(
                new LineBorder(MAU_VANG_KIM, 2),
                new EmptyBorder(10, 20, 10, 20)
        ));
        btnHelp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hienThiHuongDan();
            }
        });

        JButton btnExit = taoNutCustom("Thoát game", MAU_NUT_THOAT, MAU_CHU_TRANG_KEM);
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                xacNhanThoatUngDung();
            }
        });

        panel.add(btnStart);
        panel.add(btnHelp);
        panel.add(btnExit);

        return panel;
    }

    private JButton taoNutCustom(String text, Color mauNen, Color mauChu) {
        JButton btn = new JButton(text);
        btn.setFont(new Font("SansSerif", Font.BOLD, 16));
        btn.setBackground(mauNen);
        btn.setForeground(mauChu);
        btn.setFocusPainted(false);
        btn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        btn.setBorder(new EmptyBorder(12, 25, 12, 25));
        return btn;
    }


    private void batDauGame() {
        JOptionPane.showMessageDialog(
                this,
                "Trò chơi Ô ăn quan đang bắt đầu!",
                "Khởi tạo Trò chơi",
                JOptionPane.INFORMATION_MESSAGE
        );

        hienThiManHinhKetThuc(30, 20);
    }


    private void hienThiHuongDan() {
        String huongDan = "========================================\n"
                        + "           HƯỚNG DẪN CÁCH CHƠI Ô ĂN QUAN          \n"
                        + "========================================\n\n"
                        + "1. Bàn chơi gồm 10 Ô Dân (mỗi ô 5 viên sỏi nhỏ = 5 điểm)\n"
                        + "   và 2 Ô Quan (mỗi ô 1 viên sỏi lớn = 5 điểm).\n"
                        + "2. Hai người chơi luân phiên chọn một ô dân thuộc phía mình\n"
                        + "   và chọn hướng rải sỏi (Trái hoặc Phải).\n"
                        + "3. Khi rải hết sỏi, nếu ô tiếp theo là ô trống và liền sau đó\n"
                        + "   là ô có sỏi -> Người chơi được ĂN sỏi trong ô đó!\n"
                        + "4. Game kết thúc khi cả 2 ô Quan đều không còn sỏi.\n\n"
                        + "Chúc bạn chơi game vui vẻ!";

        JOptionPane.showMessageDialog(
                this,
                huongDan,
                "Hướng Dẫn Luật Chơi",
                JOptionPane.QUESTION_MESSAGE
        );
    }

    public void xacNhanThoatUngDung() {
        int luaChon = JOptionPane.showConfirmDialog(
                this,
                "Bạn có thực sự muốn thoát khỏi trò chơi Ô ăn quan không?",
                "Xác nhận thoát",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.WARNING_MESSAGE
        );

        if (luaChon == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    public void hienThiManHinhKetThuc(int diemP1, int diemP2) {
        String ketQua;
        if (diemP1 > diemP2) {
            ketQua = "🏆 NGUỜI CHƠI 1 CHIẾN THẮNG! 🏆";
        } else if (diemP2 > diemP1) {
            ketQua = "🏆 NGUỜI CHƠI 2 CHIẾN THẮNG! 🏆";
        } else {
            ketQua = "🤝 TRẬN ĐẤU HÒA! 🤝";
        }

        String thongBao = "========================================\n"
                        + "              KẾT THÚC TRÒ CHƠI (GAME OVER)         \n"
                        + "========================================\n\n"
                        + "📊 TỔNG ĐIỂM CHI TIẾT:\n"
                        + "   • Người chơi 1: " + diemP1 + " điểm\n"
                        + "   • Người chơi 2: " + diemP2 + " điểm\n\n"
                        + "👉 " + ketQua + "\n";

        JOptionPane.showMessageDialog(
                this,
                thongBao,
                "Kết Quả Trận Đấu",
                JOptionPane.INFORMATION_MESSAGE
        );
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GiaoDienMenuOAnQuan menu = new GiaoDienMenuOAnQuan();
                menu.setVisible(true);
            }
        });
    }
}