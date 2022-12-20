import 'package:flutter/cupertino.dart';
import 'package:flutter/material.dart';

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
              child: Image.asset('assets/images/Image_1.png'),
            ),
            const SizedBox(width: 16),
            Expanded(
              child: Column(
                crossAxisAlignment: CrossAxisAlignment.start,
                children: [
                  Text(
                    'Euronews',
                    style: Theme.of(context).textTheme.caption,
                  ),
                  Padding(
                    padding: const EdgeInsets.symmetric(vertical: 8),
                    child: Text(
                      'On politics with Lisa Loureniani: Warren’s growing crowds',
                      style: Theme.of(context).textTheme.headline6,
                    ),
                  ),
                  Row(
                    children: const [
                      Text(
                        'Politics',
                        style: TextStyle(color: CupertinoColors.activeBlue),
                      ),
                      Padding(
                        padding: EdgeInsets.symmetric(horizontal: 8),
                        child: CircleAvatar(
                          radius: 3,
                          backgroundColor: CupertinoColors.systemGrey,
                        ),
                      ),
                      Text(
                        '3m ago',
                        style: TextStyle(color: CupertinoColors.systemGrey),
                      )
                    ],
                  )
                ],
              ),
            )
          ],
        ),
        const Divider()
      ],
    );
  }
}
