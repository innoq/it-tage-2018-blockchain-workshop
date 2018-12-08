package blockchain;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class BlockMining {

    @Parameterized.Parameter(0)
    public String blockAsString;

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"3d93cb799b3970bef6c92da33af01d4fb770e98c0325f41d3ebaf8986da712c82bcd4d554bf0b5406ecafedbc8acafeea74db7f85adf94be9a85a1dd4b03aa88831dd29c4078810b56b99bb29b40d50c000001678eb36af9000400032f931efc580f9afb081b12e107b1e805f2b4f5f0f1d00c2d0f62634670921c505867ff20f6a8335e98af8725385586b41feff205b4e05a000823f78b5f8f5c021abfe6cb40bcf2e7a49709a06c0e31499bf02969ca42d203e566bcc696de08fa0102a0fd2e2330b0964abb7c443020de1cad09bfd6381ffb94daafbb90c4ed91a0613ad1dc4b47032249e1908bcf01f3cf934315a6049d2f07d983faa91b8f4e7265ecb815a7cbabc1450cb72b3c74107717aa24ac42f25b6c6784767d0e3546c4f7250191a3b6aaa2b64d126e5583b05932114bd0e148c900000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"2dd2283a4fb68066cbb1b237c2441234ceabbfdad87c311548f6790274b92e6a591d3ab1a60b734039e928d9ea5404bab769550df68c5630e3db9a02fdf5d131821b965abd30f7d14f24fdb6be16210b000001678eb36af900030003fbae72b6e6d49fb0b1851336fa2c540cdfbf78c8db492c65e75b01f2560a9dc456fea4034286569e3086ea649724959c440892daeb724c06e5133ac9aa9410ee2b9839e424cc79ce0e264af6cd43cc3025666bb9b37f81e7141567ad68c9824980dbeccd14db20a87058017115b6105239664b7683609c18b2e652daeb6bb378bb3f78805cbb81b65a6528db601d021e9e9d190cde55a8c923ed5512f448cd00189773075f4ed41c57cfd17b8bbe340215b9d1f8e2ba5b7b23c836fd3b598f59dc1577c49d9719b8b1935b802d2098a3416a1b705666de4700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"16347384ed0c45b1fd03aed94abce3d506f8f0008b2879bd2716d24e5f8d9bb6bc7f1788320f734dca02da2a9d87b594107a0001c02a0d989d36d043b759050feda68fe4fd3f33c1e955fd8255d138c9000001678eb36af900030002553cf7468a8b5af0d0a5cfdf36132ec5fa31219c00a3e38b68949ce86b060b26b1bc630b277235faaab28fa536a8035202882e7f84f527350832b781c445cb7d5dc9d16660e73e8cba69467a78046f8ddc5b37b4c415493701e9a052d951a046bacffb0215a7f3f4ad4977b36c2dddc2cc71cfbe917272bd2b3e779bac47497bde502e3ce433e591639855871860d44400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"4c2d6f31387a223c10afcc6da307515f626203b0d2613e61c238936831454bae1aa6615ab0cc842b9e2323408033ef31a15f4cbc8e6aed5193615517d572753a8560b94308c47172556f4ebf84d9869b000001678eb36af900020003f3fa8bbd746ae5d8f6b4f9e45ea594d6201d7894325fcc0015dfc0826eb1850a8d3fdd4fd0b1e3a545794c8af1e7039d43951df990a32205b15a179dcf3bcd6906f48d10e0c26cedaf7363b049194ead68a35aa1ab73014d47cc5dd12a5c4ff886eeb9bd294e9b51f566a5a13cf5d069d7c89c50f9276dcaae0b17c0fdf2e405973db230b25b23691f5c3f1fed65e192bb1b9ab60456463a3eeadbeefcb59ea811d3a44f0c16ca96fb758f8789b8a905a67fd12de8dea489545f271d8c22af4d67c716af8eee26cc94871661506383d136d576be9ef3448c00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"304c901f73a79fb51e173a4c602fb713ea252bc23ac380217831ed0b8ee62ab5c39608161fda58d1396edb238bbd7ad954db889a6b5338ad05ae4dbac2aa158b7008ca4d2887897839ec5033ec2a7f99000001678eb36af900010002e515de88b9a3ecf09ea7ec15ae1269bc7cb8068827ec9eb961b9c9126c39e52c67bc402dc8c547f75e992be27e9fdddf3ef7b559ed6539ee185364fc71d4520245ea72823d2a00c3b93660833480cd5c5c7fdaf1ab94c89e447ebe3769fb435ac513eae8af111561d70bf504ad5e0ac0eb9532462d545fa6ad0c36ab133849f20a4bb249edcb4de11061ce285ba5bd2700000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"0929b72d39eb9f4ced80347af1dee83f983cb917862d0c0a909debb561f2f9ea23ed236f662c3d1c0465fdb05b121cdc08fa01cdacb2c8f4e2ddbbb83fe8318c41c26d57a5813fab80dc5263ce881222000001678eb36af900020003ecc2c19a54e276d5be3d18acef47bf5a45a43773c47fa0748a2235587fd90ebb700ef744a7ec078fd8f6c1bea9bff9f2aa28c734247984056faa4726ead2a4b4091068c033d875ffe6dbf5317102ec3ce42a75935f34abcda33d09f76a41a3262eb4ed545635aeea329c6023d6af9e685abfe8182ae0a60cf56fd7d1d2dbd5be90fb7fabdc222f4b6dcb97623ea6fb9ac4c0dd7ac0184570063c60d43e08c4315f261f8a4f06169acd839b95954fcadf1e60ee983cbe5c218092d75f72b16cb23a856b00c4c398988e9f83b015fce7f911ba240df6fc1be400000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"10524f51c9730f1984bd6a59b9cf424c32765985e2e594cddca3d0f45bd21f49e0ae69b1fa54785d6556b8ab88812974c641ec1bdad142240c8785efb143ad746b2614e00cb1aa0bd663710b8a4d4428000001678eb36af900050002b6085f815fb55e006491bde6aa9a8d9cd88dcc2a1a772935c7f16f590a213c982cc3f5b1fc3a4922abb04d08c83dae3ca9a491428a531816513a05775e85f4d5680aa1d538a7e135a6037b2f42325dc1885e234bcefdc57ca14264937b7f2e62f53b202b38ab764ff0482a5f769813e7eaed113c5e7980d2d264d6891932c89756a0dd5a671749e34f606c4646bc211800000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"64f6f3945b8436dac670d7601bc543c74cb1b8865f1232a1a3090701ee56f34b17f6db0867a5b4bf29258668142892ba1f9af1831e04eb797125b20279d1a72eddc42d25215b89b6f8eaa71707c45108000001678eb36af900050004356e744569b46498c29bc1b8e50f71c02713646bb3a19430e718724a77d1042672d7b53ee7a72d5f2c7f0f20aa98e1e6a2ca1026a5c7c1a48e316c564483839642d38ee890168d58aadec79e991e073ce6f79f7d750bcce31130536afa1886756011c0da99d54f2cf6d5f2d175bce07b08a1b90cc2f183c7215de74224f432a8f19e0bd76c52e2586db6be50255d7a2e5213bebdfe5aac33a3fb57e05bb32f94898ceb4a87b729ba3ab0b0fbe92f1b0463715dd4a97bd0c11c7669c59fe55dc49ab3245dd5bc5bdb5a4608282377cd3a45aca69e2c751bb873378e40881c3fe598fe5d00f4f0e859fa3dc8442b012dc6ab3bc43d1311a4cc76d3581ebe2af3a57c0588c9b85b358c88a77af6a53d0b05f43ab535168a7c9e0bebba43a8d2f0a600000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
                {"40c5055239344c7f8732f737a160aa31b3cd56248e0d3d936637a3cf02e67b8b490df7509c13f3c2e8484f2dcb69c4280d2b9869ac7c8f621d7180a66df2f3956a692db6cbbbf4b50ee198b21dbe779f000001678eb36af900040005984374844492dcf8a028c58bd7d5ec76c321495e030bc8699a8a39252b76749f2e5ebc370ac2ae3f2bf04460716f5ac4659eb7e9552c8942342c99916e0b50877f4de336599327c8f525cf6ac841326c2adf02ab08670ed881d1030438383d8e23fd342aa5226a9ef5fd3ebeab44df748825a6ed744263eb9f7aba63e952b1ab7cdebe5fcbc5432212883851f08dff3e87c1f41f5632644eb1f1b0876a537cd1752770ee2a9c547fad935e04dbde542b7e2e06541a9b05d14b2a26951d9ea32ba67e4a5c49c1fa5faa557d0a91657cf907a38b43c21ec35c8c79d985c2df1f2674a70763a28ca1a25f0441ab9c6c2ee63793b69cf489ad460615c43dc07f6ca43602e86406f7d1482961b1fe54254250038d8a4aa5c9749222e4bdd7b426a587a3ab0070e7f30b83ac079397e6b3322c4c545417a3156c572be929e1ecbfd5336f423f7f2351cca57023fb87df3a37bdf729c2b31837e6400b3dc197d9e605a45f85bb251f04832400000000"},
                {"072a984d5bb45e990a714a27a73d977b503eac170ce4c344e3b693f0123772a729e6a0c0d4e7d1a00badcf156132cd4991c0f5da92dde249858ea2d0ae4b9538e6bad64a2582e77a9a9af041dda75a5b000001678eb36af900010002e448a7f4754c1d2a56751c0a948c84b0ab61c735d34880ab9ff9d8a159631cb66ac982c808c5ec232c72825c8307ebf5b6a81c26773091c825c09f957f878dff66dc659283a66c37446a1e6745186e620dab8893ef3770b14e7fb238f35a44796df7c6eb9aa6971b55baff4a5f68f8c9a1d0acd4f6e25bd16dd7b21579ad2db3d6aa05c5c07561bd432d82402f77b9da00000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000"},
        });
    }
    
    @Test
    public void mineBlock() {
        Block block = new Block(Utils.hexStringToByteArray(blockAsString));
        block.mine();
        Assert.assertTrue("Block doesn't validate with nonce: " + block.getNonce(), block.validate());
    }
}
