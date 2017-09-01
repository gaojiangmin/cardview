Gradle 依赖


compile 'com.android.support:cardview-v7:25.3.1'
记得添加最新的版本
布局中使用


<android.support.v7.widget.CardView
    android:id="@+id/cardView"
    android:layout_width="match_parent"
    android:layout_height="wrap_content"
    android:layout_margin="10dp">

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="wrap_content">

        <ImageView
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_margin="5dp"
            android:scaleType="centerCrop"
            android:src="@drawable/ic_movie3" />

        <LinearLayout
            android:layout_width="match_parent"
            android:layout_height="match_parent"
            android:orientation="vertical">

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:padding="5dp"
                android:text="大圣归来"
                android:textSize="18sp"
                android:textStyle="bold" />

            <TextView
                android:layout_width="match_parent"
                android:layout_height="wrap_content"
                android:padding="5dp"
                android:text="我愿意为你在城里的月光下温暖冷..." />
        </LinearLayout>
    </LinearLayout>
</android.support.v7.widget.CardView>

cardview常用属性


card_view:cardElevation                        阴影的大小
card_view:cardMaxElevation                     阴影最大高度
card_view:cardBackgroundColor                  卡片的背景色
card_view:cardCornerRadius                     卡片的圆角大小
card_view:contentPadding                       卡片内容于边距的间隔
card_view:contentPaddingBottom                 卡片内容与底部的边距
card_view:contentPaddingTop                    卡片内容与顶部的边距
card_view:contentPaddingLeft                   卡片内容与左边的边距
card_view:contentPaddingRight                  卡片内容与右边的边距
card_view:contentPaddingStart                  卡片内容于边距的间隔起始
card_view:contentPaddingEnd                    卡片内容于边距的间隔终止
card_view:cardUseCompatPadding                 设置内边距，V21+的版本和之前的版本仍旧具有一样的计算方式card_view:cardPreventConrerOverlap在V20和之前的版本中添加内边距，这个属性为了防止内容和边角的重叠

相应属性在代码中也可以设置

cardView = (CardView)findViewById(R.id.cardView);

cardView.setRadius(16);//设置图片圆角的半径大小

cardView.setCardElevation(16);//设置阴影部分大小

cardView.setContentPadding(10,10,10,10);//设置图片距离阴影大小
