import 'package:flutter/cupertino.dart';
import 'package:skeleton_loading_flutter/features/news_page.dart';

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const CupertinoApp(
      theme: CupertinoThemeData(
        primaryColor: CupertinoColors.activeBlue,
      ),
      home: NewsPage(),
    );
  }
}
