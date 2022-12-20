import 'package:flutter/cupertino.dart';

import 'package:skeleton_loading_flutter/data/news_fake.dart';

class NewsCard extends StatelessWidget {
  const NewsCard({super.key, required this.image});

  final String image;

  @override
  Widget build(BuildContext context) {
    return Column(
      children: [
        Row(
          children: [
            SizedBox(
              height: 120,
              width: 120,
              child: ClipRRect(
                borderRadius: BorderRadius.circular(10),
                child: Image.asset(
                  image,
                  fit: BoxFit.cover,
                ),
              ),
            ),
            const SizedBox(width: 16),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    channels[images.indexOf(image)],
                    style: const TextStyle(
                      color: CupertinoColors.systemGrey,
                      fontSize: 12,
                    ),
                  ),
                  Padding(
                    padding: const EdgeInsets.symmetric(vertical: 8),
                    child: Text(
                      news[images.indexOf(image)],
                      style: const TextStyle(
                        color: CupertinoColors.black,
                        fontSize: 16,
                        fontWeight: FontWeight.w600,
                      ),
                    ),
                  ),
                  Row(
                    children: [
                      Text(
                        categories[images.indexOf(image)],
                        style:
                            const TextStyle(color: CupertinoColors.activeBlue),
                      ),
                      const Padding(
                        padding: EdgeInsets.symmetric(horizontal: 8),
                        child: Text(
                          '•',
                          style: TextStyle(
                            color: CupertinoColors.systemGrey,
                            fontSize: 24,
                          ),
                        ),
                      ),
                      Text(
                        dates[images.indexOf(image)],
                        style: const TextStyle(
                          color: CupertinoColors.systemGrey,
                        ),
                      )
                    ],
                  )
                ],
              ),
            )
          ],
        ),
      ],
    );
  }
}
