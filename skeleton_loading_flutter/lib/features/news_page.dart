import 'package:flutter/cupertino.dart';
import 'package:skeleton_loading_flutter/features/news_card.dart';
import 'package:skeleton_loading_flutter/utils/constants.dart';

class NewsPage extends StatefulWidget {
  const NewsPage({super.key});

  @override
  State<NewsPage> createState() => _NewsPageState();
}

class _NewsPageState extends State<NewsPage> {
  late bool _isLoading;

  @override
  void initState() {
    _isLoading = true;
    Future.delayed(const Duration(seconds: 2), () {
      setState(() {
        _isLoading = false;
      });
    });
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return CupertinoPageScaffold(
      navigationBar: const CupertinoNavigationBar(
        backgroundColor: CupertinoColors.white,
        middle: Text(
          'News App',
          style: TextStyle(color: CupertinoColors.black),
        ),
      ),
      child: Padding(
        padding: const EdgeInsets.symmetric(
          horizontal: defaultPadding,
          vertical: defaultPadding,
        ),
        child: Column(
          children: [
            if (_isLoading)
              const Center(
                child: CupertinoActivityIndicator(),
              )
            else
              Expanded(
                child: ListView.separated(
                  itemCount: 6,
                  itemBuilder: (context, index) => NewsCard(
                    image: 'assets/images/Image_$index.png',
                  ),
                  separatorBuilder: (context, index) =>
                      const SizedBox(height: defaultPadding),
                ),
              ),
          ],
        ),
      ),
    );
  }
}
