package com.example.smarthome;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;


public class start_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.start);
        findViewById(R.id.bt_start).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(start_activity.this, login_activity.class);
                startActivity(intent);
            }
        });
        findViewById(R.id.bt_used).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {
                AlertDialog.Builder b = new AlertDialog.Builder(start_activity.this);
                b.setTitle("Hướng dẫn sử dụng");
                b.setMessage("Tối 17-10, tại buổi họp báo sau ngày làm việc thứ 3 Đại hội Đại biểu Đảng bộ TP.HCM lần thứ XI, nhiệm kỳ 2020-2025, Trưởng Ban Tuyên giáo Thành ủy TP Phan Nguyễn Như Khuê cho biết tại phiên họp thứ nhất Ban Chấp hành Đảng bộ TP khóa XI, nhiệm kỳ 2020-2025 đã bầu ông Nguyễn Văn Nên làm Bí thư Thành ủy TP. \n" +
                        "\n" +
                        "Ông Nguyễn Văn Nên trúng cử Bí thư Thành ủy TP.HCM với 62/62 phiếu, đạt tỷ lệ 100%.\n" +
                        "\n" +
                        "Cùng với chức danh Bí thư Thành ủy, phiên họp cũng bầu 4 Phó Bí thư Thành ủy TP gồm: ông Trần Lưu Quang (Phó Bí thư Thường trực Thành ủy khóa X); ông Nguyễn Thành Phong (Chủ tịch UBND TP); bà Nguyễn Thị Lệ (Chủ tịch HĐND TP); ông Nguyễn Hồ Hải (Trưởng Ban Tổ chức Thành ủy TP).\n" +
                        "\n" +
                        "Ban chấp hành Đảng bộ TP.HCM nhiệm kỳ 2020 - 2025 cũng bầu Ban thường vụ Thành ủy gồm 15 người. Thêm một người là ông Nguyễn Văn Nên được Bộ Chính trị chỉ định. Như vậy Ban Thường vụ Thành ủy TP khóa XI có 16 người. \n" +
                        "\n" +
                        "Theo quyết định của Bộ Chính trị được công bố trưa nay, ông Nguyễn Thiện Nhân được phân công theo dõi, chỉ đạo Thành ủy TP.HCM sau Đại hội Đảng bộ TP.HCM khoá XI cho đến khi kết thúc Đại hội Đảng toàn quốc khoá XIII (dự kiến tháng 1-2021).\n" +
                        "\n" +
                        "Ông Nguyễn Văn Nên quê ở Tây Ninh, là cử nhân Luật từng làm Chủ tịch UBND rồi Bí thư tỉnh ủy Tây Ninh. \n" +
                        "\n" +
                        "Tháng 7-2011, ông Nên là Ủy viên Trung ương Đảng, Phó ban Thường trực Ban chỉ đạo Tây Nguyên. Sau đó ông được bổ nhiệm chức Phó ban Tuyên giáo Trung ương.\n" +
                        "\n" +
                        "Tháng 11-2013, ông Nguyễn Văn Nên được phê chuẩn giữ chức Bộ trưởng, Chủ nhiệm Văn phòng Chính phủ. \n" +
                        "\n" +
                        "Đến tháng 1-2016, ông được bầu vào Ban Chấp hành Trung ương Đảng khoá XII. Sau đó, ông được bầu vào Ban Bí thư Trung ương Đảng và được phân công giữ chức Chánh văn phòng Trung ương Đảng.\n" +
                        "\n" +
                        "Hôm 11-10, Bộ Chính trị chỉ định ông Nguyễn Văn Nên tham gia Ban Chấp hành, Ban Thường vụ và giới thiệu để Ban chấp hành đảng bộ TP.HCM khoá XI bầu làm Bí thư Thành ủy TP.HCM.");
                b.setNegativeButton("Xong", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
                AlertDialog al = b.create();
                al.show();
            }
        });
    }
}
